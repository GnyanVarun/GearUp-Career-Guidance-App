package com.example.gearup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Engineering extends AppCompatActivity implements View.OnClickListener {
 private CardView aerospace,agriculture,automotive,biomedical,chemical,civil,computer,data,design,electrical;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);
        aerospace = findViewById(R.id.aerospace);
        agriculture = findViewById(R.id.agriculture);
        automotive = findViewById(R.id.automotive);
        biomedical = findViewById(R.id.biomedical);
        chemical = findViewById(R.id.chemical);
        civil = findViewById(R.id.civil);
        computer = findViewById(R.id.computer);
        data = findViewById(R.id.data);
        design = findViewById(R.id.design_engineer);
        electrical = findViewById(R.id.electrical);

        aerospace.setOnClickListener(this);
        agriculture.setOnClickListener(this);
        automotive.setOnClickListener(this);
        biomedical.setOnClickListener(this);
        chemical.setOnClickListener(this);
        civil.setOnClickListener(this);
        computer.setOnClickListener(this);
        data.setOnClickListener(this);
        design.setOnClickListener(this);
        electrical.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.aerospace : i = new Intent(this,Aerospace.class);startActivity(i); break;
            case R.id.agriculture: i = new Intent(this,Agriculture.class);startActivity(i);break;
            case R.id.automotive: i=new Intent(this,Automotive.class);startActivity(i);break;
            case R.id.biomedical: i=new Intent(this,Biomedical.class);startActivity(i);break;
            case R.id.chemical: i=new Intent(this,Chemical.class);startActivity(i);break;
            case R.id.civil: i=new Intent(this,Civil.class);startActivity(i);break;
            case R.id.computer: i=new Intent(this,Computer.class);startActivity(i);break;
            case R.id.data: i=new Intent(this,Data.class);startActivity(i);break;
            case R.id.design_engineer: i=new Intent(this,Design_engineer.class);startActivity(i);break;
            case R.id.electrical: i=new Intent(this,Electrical.class);startActivity(i);break;
            default:break;
        }
    }
}
