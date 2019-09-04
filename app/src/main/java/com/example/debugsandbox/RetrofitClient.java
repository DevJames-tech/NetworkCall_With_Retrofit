package com.example.debugsandbox;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {


    private static Retrofit getRetrofitInstance(){

        return new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    //Get API Service
    //return API Service

    public static RetrofitApiService getRetrofitHeroInstance(){

        // takes instance and Hero and Service
        return getRetrofitInstance().create(RetrofitApiService.class);
    }
}
