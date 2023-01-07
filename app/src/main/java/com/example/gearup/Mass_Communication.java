package com.example.gearup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Mass_Communication extends AppCompatActivity  implements View.OnClickListener{
    private CardView business_reporter,marketing_coordinator,copywriter,brand_strategist,social_media_manager,managing_editor,content_marketing_manager,web_producer,journalist,news_anchor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass__communication);
        business_reporter = findViewById(R.id.mass_1);
        marketing_coordinator = findViewById(R.id.mass_2);
        copywriter = findViewById(R.id.mass_3);
        brand_strategist = findViewById(R.id.mass_4);
        social_media_manager = findViewById(R.id.mass_5);
        managing_editor = findViewById(R.id.mass_6);
        content_marketing_manager = findViewById(R.id.mass_7);
        web_producer = findViewById(R.id.mass_8);
        journalist = findViewById(R.id.mass_9);
        news_anchor = findViewById(R.id.mass_10);

        business_reporter.setOnClickListener(this);
        marketing_coordinator.setOnClickListener(this);
        copywriter.setOnClickListener(this);
        brand_strategist.setOnClickListener(this);
        social_media_manager.setOnClickListener(this);
        managing_editor.setOnClickListener(this);
        content_marketing_manager.setOnClickListener(this);
        web_producer.setOnClickListener(this);
        journalist.setOnClickListener(this);
        news_anchor.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.mass_1 : i=new Intent(this,Business_reporter.class);startActivity(i);break;
            case R.id.mass_2 : i=new Intent(this,Marketing_coordinator.class);startActivity(i);break;
            case R.id.mass_3 : i=new Intent(this,Copywriter.class);startActivity(i);break;
            case R.id.mass_4 : i=new Intent(this,Brand_strategist.class);startActivity(i);break;
            case R.id.mass_5 : i=new Intent(this,Social_media_manager.class);startActivity(i);break;
            case R.id.mass_6 : i=new Intent(this,Managing_editor.class);startActivity(i);break;
            case R.id.mass_7 : i=new Intent(this,Content_marketing_manager.class);startActivity(i);break;
            case R.id.mass_8 : i=new Intent(this,Web_producer.class);startActivity(i);break;
            case R.id.mass_9 : i=new Intent(this,Journalist.class);startActivity(i);break;
            case R.id.mass_10 : i=new Intent(this,News_anchor.class);startActivity(i);break;
            default:break;
        }
    }
}
