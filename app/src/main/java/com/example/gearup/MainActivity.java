package com.example.gearup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private CardView Card_1, Card_2, Card_3, Card_4, Card_5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Window window = getWindow();
        WindowManager.LayoutParams winParams = window.getAttributes();
       winParams.flags &=~WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
        window.setAttributes(winParams);
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE );// View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        //window.statusBarColor = Color.TRANSPARENT;
        Card_1 = findViewById(R.id.guide_card);
        Card_2 = findViewById(R.id.hire_card);
        Card_3 = findViewById(R.id.news_card);
        Card_4 = findViewById(R.id.tips_card);
        Card_5 = findViewById(R.id.gear_card);


        //Add click listener to the cards

        Card_1.setOnClickListener(this);
        Card_2.setOnClickListener(this);
        Card_3.setOnClickListener(this);
        Card_4.setOnClickListener(this);
        Card_5.setOnClickListener(this);

        // disabling action bar for dashboard activity
        try {
            getSupportActionBar().hide();
        } catch (NullPointerException e) {
        }

    }
    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.guide_card : i = new Intent(this, Career.class); startActivity(i); break;
            case R.id.hire_card : i =new Intent(this, Hire.class);startActivity(i); break;
            case R.id.news_card : i =new Intent(this, News.class);startActivity(i);break;
            case R.id.tips_card : i =new Intent(this, Tips.class);startActivity(i);break;
            case R.id.gear_card : i =new Intent(this, Gear.class);startActivity(i);break;
            default:break;

        }
    }
}




