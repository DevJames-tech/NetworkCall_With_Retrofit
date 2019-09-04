package com.example.debugsandbox;

import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GetResponse {

    private RetrofitApiService myService = RetrofitClient.getRetrofitHeroInstance();

    private ArrayList<HeroAlbum> holdsHeroResponse;
    private Call<ArrayList<HeroAlbum>> getCallback = myService.getCallArrayListHeroAlbum();
    private thisRetrofitResponse retrofitContract;

    public interface thisRetrofitResponse{


         void retrieveResults(ArrayList<HeroAlbum> heroAlbumArrayList);

    }

    public GetResponse(thisRetrofitResponse mainActivityRetrofitResponse){


        retrofitContract = mainActivityRetrofitResponse;
    }


    public void getRetrofitCallback() {

        holdsHeroResponse = new ArrayList<>();

        getCallback.enqueue(new Callback<ArrayList<HeroAlbum>>() {
            @Override
            public void onResponse(Call<ArrayList<HeroAlbum>> call, Response<ArrayList<HeroAlbum>> response) {

            holdsHeroResponse = response.body();

                Log.d("TAG", "success");
                //get actually get item in response array instead of whole array holdsHeroResponse.tostring
                Log.d("TAG", holdsHeroResponse.get(2).getThumbnailUrl());


                retrofitContract.retrieveResults(holdsHeroResponse);


            }

            @Override
            public void onFailure(Call<ArrayList<HeroAlbum>> call, Throwable t) {

                Log.d("TAG", "failled response", t);

            }
        });


    }
}
