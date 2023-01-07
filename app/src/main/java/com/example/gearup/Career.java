package com.example.gearup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Career extends AppCompatActivity implements View.OnClickListener {
    private CardView engg_card,dollar_card,privacy_card,creative_card,res_card,defend_card,media_card,healthcard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_career);
        engg_card = findViewById(R.id.Engg_card);
        dollar_card = findViewById(R.id.money);
        privacy_card = findViewById(R.id.security);
        creative_card = findViewById(R.id.design);
        res_card = findViewById(R.id.manage);
        defend_card = findViewById(R.id.service);
        media_card = findViewById(R.id.media);
        healthcard = findViewById(R.id.health);

        engg_card.setOnClickListener(this);
        dollar_card.setOnClickListener(this);
        privacy_card.setOnClickListener(this);
        creative_card.setOnClickListener(this);
        res_card.setOnClickListener(this);
        defend_card.setOnClickListener(this);
        media_card.setOnClickListener(this);
        healthcard.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.Engg_card : i =new Intent(this,Engineering.class);startActivity(i);break;
            case R.id.money : i =new Intent(this,Commerce.class);startActivity(i); break;
            case R.id.security : i=new Intent(this,IT.class);startActivity(i); break;
            case R.id.design : i=new Intent(this,Design.class);startActivity(i);break;
            case R.id.manage : i=new Intent(this,Management.class);startActivity(i);break;
            case R.id.service : i=new Intent(this,Public_Services.class);startActivity(i);break;
            case R.id.media : i=new Intent(this,Mass_Communication.class);startActivity(i);break;
            case R.id.health : i=new Intent(this,Healthcare.class);startActivity(i);break;
            default:break;
        }


    }
}
