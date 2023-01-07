package com.example.gearup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Public_Services extends AppCompatActivity implements View.OnClickListener {
    private CardView IAS,IPS,IFS,IRS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_public__services);
        IAS = findViewById(R.id.ps_1);
        IPS = findViewById(R.id.ps_2);
        IFS = findViewById(R.id.ps_3);
        IRS = findViewById(R.id.ps_4);

        IAS.setOnClickListener(this);
        IPS.setOnClickListener(this);
        IFS.setOnClickListener(this);
        IRS.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent i;
        switch (v.getId()) {
            case R.id.ps_1 : i=new Intent(this,IAS.class);startActivity(i);break;
            case R.id.ps_2 : i=new Intent(this,IPS.class);startActivity(i);break;
            case R.id.ps_3 : i=new Intent(this,IFS.class);startActivity(i);break;
            case R.id.ps_4 : i=new Intent(this,IRS.class);startActivity(i);break;
            default:break;
        }

    }
}
