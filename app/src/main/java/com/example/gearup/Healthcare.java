package com.example.gearup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Healthcare extends AppCompatActivity implements View.OnClickListener{
    private CardView dietitian,medical_physicist,nurse,orthoptist,pharmacist,physical_therapist,psychiatrist,pediatrician,veterinarian,optometrist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthcare);
        dietitian = findViewById(R.id.hc_1);
        medical_physicist = findViewById(R.id.hc_2);
        nurse = findViewById(R.id.hc_3);
        orthoptist = findViewById(R.id.hc_4);
        pharmacist = findViewById(R.id.hc_5);
        physical_therapist = findViewById(R.id.hc_6);
        psychiatrist = findViewById(R.id.hc_7);
        pediatrician = findViewById(R.id.hc_8);
        veterinarian = findViewById(R.id.hc_9);
        optometrist = findViewById(R.id.hc_10);

        dietitian.setOnClickListener(this);
        medical_physicist.setOnClickListener(this);
        nurse.setOnClickListener(this);
        orthoptist.setOnClickListener(this);
        pharmacist.setOnClickListener(this);
        physical_therapist.setOnClickListener(this);
        psychiatrist.setOnClickListener(this);
        pediatrician.setOnClickListener(this);
        veterinarian.setOnClickListener(this);
        optometrist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.hc_1 : i=new Intent(this,Dietitian.class);startActivity(i);break;
            case R.id.hc_2 : i=new Intent(this,Medical_physicist.class);startActivity(i);break;
            case R.id.hc_3 : i=new Intent(this,Nurse.class);startActivity(i);break;
            case R.id.hc_4 : i=new Intent(this,Orthoptist.class);startActivity(i);break;
            case R.id.hc_5 : i=new Intent(this,Pharmacist.class);startActivity(i);break;
            case R.id.hc_6 : i=new Intent(this,Physical_therapist.class);startActivity(i);break;
            case R.id.hc_7 : i=new Intent(this,Psychiatrist.class);startActivity(i);break;
            case R.id.hc_8 : i=new Intent(this,Pediatrician.class);startActivity(i);break;
            case R.id.hc_9 : i=new Intent(this,Veterinarian.class);startActivity(i);break;
            case R.id.hc_10 : i=new Intent(this,Optometrist.class);startActivity(i);break;
            default:break;
        }
    }
}
