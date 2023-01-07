package com.example.gearup;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("top-headlines")
    Call<Headlines> getHeadlines(
            @Query("country") String country,
            @Query("apikey") String apikey
    );

    @GET("everything")
    Call<Headlines> getSpecificData(
            @Query("q") String query,
            @Query("apikey") String apikey
    );

}
