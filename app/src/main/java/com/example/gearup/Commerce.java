package com.example.gearup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Commerce extends AppCompatActivity implements View.OnClickListener {
        private CardView chartered,cost,company,financemanager,portfoliomanager,financeplanner,financeconsultant,taxconsultant,financeanalyst,investmentanalyst,financecontroller,taxauditor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commerce);
        chartered = findViewById(R.id.CA_1);
        cost = findViewById(R.id.CA_2);
        company = findViewById(R.id.CS);
        financemanager = findViewById(R.id.finance_manager);
        portfoliomanager = findViewById(R.id.portfolio_manager);
        financeplanner = findViewById(R.id.finance_planner);
        financeconsultant = findViewById(R.id.finance_consultant);
        taxconsultant = findViewById(R.id.tax_consultant);
        financeanalyst = findViewById(R.id.finance_analyst);
        investmentanalyst = findViewById(R.id.investment_analyst);
        financecontroller = findViewById(R.id.finance_controller);
        taxauditor = findViewById(R.id.tax_auditor);

        chartered.setOnClickListener(this);
        cost.setOnClickListener(this);
        company.setOnClickListener(this);
        financemanager.setOnClickListener(this);
        portfoliomanager.setOnClickListener(this);
        financeplanner.setOnClickListener(this);
        financeconsultant.setOnClickListener(this);
        taxconsultant.setOnClickListener(this);
        financeanalyst.setOnClickListener(this);
        investmentanalyst.setOnClickListener(this);
        financecontroller.setOnClickListener(this);
        taxauditor.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.CA_1 : i=new Intent(this,Chartered_accountant.class);startActivity(i);break;
            case R.id.CA_2 : i=new Intent(this,Cost_accountant.class);startActivity(i);break;
            case R.id.CS : i = new Intent(this,Company_secretary.class);startActivity(i);break;
            case R.id.finance_manager : i=new Intent(this,Finance_manager.class);startActivity(i);break;
            case R.id.portfolio_manager : i=new Intent(this,Portfolio_manager.class);startActivity(i);break;
            case R.id.finance_planner : i=new Intent(this,Finance_planner.class);startActivity(i);break;
            case R.id.finance_consultant: i=new Intent(this,Finance_consultant.class);startActivity(i);break;
            case R.id.tax_consultant: i=new Intent(this,Tax_consultant.class);startActivity(i);break;
            case R.id.finance_analyst : i=new Intent(this,Finance_analyst.class);startActivity(i);break;
            case R.id.investment_analyst : i=new Intent(this,Investment_analyst.class);startActivity(i);break;
            case R.id.finance_controller : i=new Intent(this,Finance_controller.class);startActivity(i);break;
            case R.id.tax_auditor : i=new Intent(this,Tax_auditor.class);startActivity(i);break;
            default:break;

        }
    }
}
