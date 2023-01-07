package com.example.gearup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Management extends AppCompatActivity implements View.OnClickListener {
        private CardView marketing,sales,financial,information_systems,relations,resources,general,benefits;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_management);

        marketing = findViewById(R.id.man_1);
        sales = findViewById(R.id.man_2);
        financial = findViewById(R.id.man_3);
        information_systems = findViewById(R.id.man_4);
        relations = findViewById(R.id.man_5);
        resources = findViewById(R.id.man_6);
        general = findViewById(R.id.man_7);
        benefits = findViewById(R.id.man_8);

        marketing.setOnClickListener(this);
        sales.setOnClickListener(this);
        financial.setOnClickListener(this);
        information_systems.setOnClickListener(this);
        relations.setOnClickListener(this);
        resources.setOnClickListener(this);
        general.setOnClickListener(this);
        benefits.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.man_1 : i=new Intent(this,Marketing_manager.class);startActivity(i);break;
            case R.id.man_2 : i=new Intent(this,Sales_manager.class);startActivity(i);break;
            case R.id.man_3 : i=new Intent(this,Financial_manager.class);startActivity(i);break;
            case R.id.man_4 : i=new Intent(this,Information_systems_manager.class);startActivity(i);break;
            case R.id.man_5 : i=new Intent(this,Public_relations_manager.class);startActivity(i);break;
            case R.id.man_6 : i=new Intent(this,Human_resources_manager.class);startActivity(i);break;
            case R.id.man_7 : i=new Intent(this,General_manager.class);startActivity(i);break;
            case R.id.man_8 : i=new Intent(this,Benefits_manager.class);startActivity(i);break;
            default:break;
        }
    }
}
