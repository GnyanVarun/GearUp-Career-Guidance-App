package com.example.gearup;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class News extends AppCompatActivity{
    RecyclerView recyclerView;
    SwipeRefreshLayout swipeRefreshLayout;
    EditText etQuery;
   Button btnSearch;
    final String API_KEY = "8d13d68df92d498199b3f2f89ff6f600";
    Adapter adapter;
    List<Articles> articles = new ArrayList<>();

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        recyclerView = findViewById(R.id.recyclerView);
        swipeRefreshLayout = findViewById(R.id.swipeRefresh);
        etQuery = findViewById(R.id.etQuery);
        btnSearch = findViewById(R.id.btnSearch);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        final String country = getCountry();

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                retrieveJson("",country,API_KEY);
            }
        });
        retrieveJson("",country,API_KEY);
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!etQuery.getText().toString().equals("")){

                    swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                        @Override
                        public void onRefresh() {
                            retrieveJson(etQuery.getText().toString(),country,API_KEY);
                        }
                    });
                    retrieveJson(etQuery.getText().toString(),country,API_KEY);
                }
                else
                {
                    swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
                        @Override
                        public void onRefresh() {
                            retrieveJson("",country,API_KEY);
                        }
                    });
                    retrieveJson("",country,API_KEY);
                }
            }
        });



}

public void retrieveJson(String query, String country, String apikey){

        swipeRefreshLayout.setRefreshing(true);
        Call<Headlines> call;
        if (!etQuery.getText().toString().equals("")){
            call = ApiClient.getInstance().getApi().getSpecificData(query, apikey);
        }
        else
        {
            call = ApiClient.getInstance().getApi().getHeadlines(country,apikey);
        }
        call.enqueue(new Callback<Headlines>() {
        @Override
        public void onResponse(Call<Headlines> call, Response<Headlines> response) {
            if (response.isSuccessful() && response.body().getArticles() !=null){
                swipeRefreshLayout.setRefreshing(false);
                articles.clear();
                articles = response.body().getArticles();
                adapter = new Adapter(News.this,articles);
                recyclerView.setAdapter(adapter);
            }
        }

        @Override
        public void onFailure(Call<Headlines> call, Throwable t) {
            swipeRefreshLayout.setRefreshing(false);
            Toast.makeText(News.this, t.getLocalizedMessage(),Toast.LENGTH_SHORT).show();
        }
    });
}

    public String getCountry(){
        Locale locale = Locale.getDefault();
        String country = locale.getCountry();
        return country.toLowerCase();
    }




        }



