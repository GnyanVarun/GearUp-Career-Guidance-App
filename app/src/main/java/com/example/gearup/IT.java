package com.example.gearup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class IT extends AppCompatActivity implements View.OnClickListener{
    private CardView programmer,developer,DBA,system_analyst,system_engineer,network_engineer,network_administrator,technical_engineer,computer_scientist,software_engineer,security_specialist,data_scientist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);
        programmer = findViewById(R.id.it_1);
        developer = findViewById(R.id.it_2);
        DBA = findViewById(R.id.it_3);
        system_analyst = findViewById(R.id.it_4);
        system_engineer = findViewById(R.id.it_5);
        network_engineer = findViewById(R.id.it_6);
        network_administrator = findViewById(R.id.it_7);
        technical_engineer = findViewById(R.id.it_8);
        computer_scientist = findViewById(R.id.it_9);
        software_engineer = findViewById(R.id.it_10);
        security_specialist = findViewById(R.id.it_11);
        data_scientist = findViewById(R.id.it_12);

        programmer.setOnClickListener(this);
        developer.setOnClickListener(this);
        DBA.setOnClickListener(this);
        system_analyst.setOnClickListener(this);
        system_engineer.setOnClickListener(this);
        network_engineer.setOnClickListener(this);
        network_administrator.setOnClickListener(this);
        technical_engineer.setOnClickListener(this);
        computer_scientist.setOnClickListener(this);
        software_engineer.setOnClickListener(this);
        security_specialist.setOnClickListener(this);
        data_scientist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.it_1 : i=new Intent(this,Programmer.class);startActivity(i);break;
            case R.id.it_2 : i=new Intent(this,Developer.class);startActivity(i);break;
            case R.id.it_3 : i=new Intent(this,System_engineer.class);startActivity(i);break;
            case R.id.it_4 : i=new Intent(this,Network_engineer.class);startActivity(i);break;
            case R.id.it_5 : i=new Intent(this, DBA.class);startActivity(i);break;
            case R.id.it_6 : i= new Intent(this,System_analyst.class);startActivity(i);break;
            case R.id.it_7 : i=new Intent(this,Network_administrator.class);startActivity(i);break;
            case R.id.it_8 : i=new Intent(this,Technical_engineer.class);startActivity(i);break;
            case R.id.it_9 : i=new Intent(this,Computer_scientist.class);startActivity(i);break;
            case R.id.it_10 :i=new Intent(this,Software_engineer.class);startActivity(i);break;
            case R.id.it_11 :i=new Intent(this,Security_specialist.class);startActivity(i);break;
            case R.id.it_12 :i=new Intent(this,Data_scientist.class);startActivity(i);break;
            default:break;
        }
    }
}
