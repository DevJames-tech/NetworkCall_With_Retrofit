package com.example.debugsandbox;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitApiService {

    @GET("/photos")


    Call<ArrayList<HeroAlbum>> getCallArrayListHeroAlbum();
}
