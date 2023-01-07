package com.example.gearup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {
    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    TabLayout tabIndicator;
    Button btnNext;
    int position = 0;
    Button btnGetStarted;
    Animation btnAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //make the activity as full screen
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //when this activity is about to launch we need to check if its opened before or not
        if (restorePrefData()){
            Intent mainActivity = new Intent(getApplicationContext(),MainActivity.class);
            startActivity(mainActivity);
            finish();
        }

        setContentView(R.layout.activity_intro);
        //hide the action bar
       // getSupportActionBar().hide();


        //ini views
        btnNext = findViewById(R.id.btn_next);
        btnGetStarted = findViewById(R.id.btn_get_started);
        tabIndicator = findViewById(R.id.tab_indicator);
        btnAnim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.button_animation);


        //fill list screen
        final List<ScreenItem>  mList = new ArrayList<>();
        mList.add(new ScreenItem("Set Your Goal","This one step—choosing a goal and sticking to it—changes everything.",R.drawable.set));
        mList.add(new ScreenItem("Dream Big","Always dream and shoot higher than you know you can do. Don’t bother just to be better than your contemporaries or predecessors. Try to be better than yourself.",R.drawable.dream));
        mList.add(new ScreenItem("Take Action","Think about how it will feel once you accomplish it—remind yourself what you have to gain from accomplishing this goal as well as what’s at stake if you don’t accomplish it.",R.drawable.action));


        // setup viewpager
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this,mList);
        screenPager.setAdapter(introViewPagerAdapter);

        //setup tablayout with viewpager
        tabIndicator.setupWithViewPager(screenPager);

        //next button click listener
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                position = screenPager.getCurrentItem();
                if (position < mList.size()){
                    position++;
                    screenPager.setCurrentItem(position);
                }
                if (position == mList.size()-1){
                    //when we slide to the last screen
                    //TODO : show the GETSTARTED Button and hide the indicator and the next button
                    loadLastScreen();
                }
            }
        });
            // tablayout add change listener
            tabIndicator.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    if (tab.getPosition() == mList.size()-1){
                        loadLastScreen();
                    }
                }

                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }
            });

            //Get started button click listener
            btnGetStarted.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // open main activity
                    Intent mainActivity = new Intent(getApplicationContext(),MainActivity.class);
                    startActivity(mainActivity);
                    // also we need a boolean value to store so next time when the user run the app
                    //we could know that he is already checked the intro screen activity
                    savePrefsData();
                    finish();
                }
            });



    }

    private boolean restorePrefData() {
        SharedPreferences pref =getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        Boolean isIntroActivityopenedBefore = pref.getBoolean("isIntroOpened",false);
        return isIntroActivityopenedBefore;
    }

    private void savePrefsData() {

        SharedPreferences pref = getApplicationContext().getSharedPreferences("myPrefs",MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        editor.putBoolean("isIntroOpened",true);
        editor.commit();

    }

    //show the GETSTARTED Button and hide the indicator and the next button
    private void loadLastScreen() {
        btnNext.setVisibility(View.INVISIBLE);
        btnGetStarted.setVisibility(View.VISIBLE);
        tabIndicator.setVisibility(View.INVISIBLE);
        // TODO  : Add an animation to the get started button
        // setup animation :
            btnGetStarted.setAnimation(btnAnim);
    }
}
