package com.example.gearup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Design extends AppCompatActivity implements View.OnClickListener {
    private CardView graphic_designer,UX_designer,UI_designer,photographer,interior_designer,animator,fashion_designer,video_editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design);
        graphic_designer = findViewById(R.id.de_1);
        UX_designer = findViewById(R.id.de_2);
        UI_designer = findViewById(R.id.de_3);
        photographer = findViewById(R.id.de_4);
        interior_designer = findViewById(R.id.de_5);
        animator = findViewById(R.id.de_6);
        fashion_designer = findViewById(R.id.de_7);
        video_editor = findViewById(R.id.de_8);

        graphic_designer.setOnClickListener(this);
        UX_designer.setOnClickListener(this);
        UI_designer.setOnClickListener(this);
        photographer.setOnClickListener(this);
        interior_designer.setOnClickListener(this);
        animator.setOnClickListener(this);
        fashion_designer.setOnClickListener(this);
        video_editor.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId()) {
            case R.id.de_1 : i=new Intent(this,Graphic_designer.class);startActivity(i);break;
            case R.id.de_2 : i=new Intent(this,UX_designer.class);startActivity(i);break;
            case R.id.de_3 : i=new Intent(this, UI_designer.class);startActivity(i);break;
            case R.id.de_4 : i=new Intent(this,Photographer.class);startActivity(i);break;
            case R.id.de_5 : i=new Intent(this,Interior_designer.class);startActivity(i);break;
            case R.id.de_6 : i=new Intent(this,Animator.class);startActivity(i);break;
            case R.id.de_7 : i=new Intent(this,Fashion_designer.class);startActivity(i);break;
            case R.id.de_8 : i=new Intent(this,Video_editor.class);startActivity(i);break;
            default:break;
        }
    }
}
