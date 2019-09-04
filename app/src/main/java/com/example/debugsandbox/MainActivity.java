package com.example.debugsandbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements GetResponse.thisRetrofitResponse{

    RecyclerViewAdapter recyclerViewAdapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startNetworkRequest();

    }

    public void startNetworkRequest() {

        GetResponse retrofitResponse = new GetResponse(this);
        retrofitResponse.getRetrofitCallback();

    }


    @Override
    public void retrieveResults(ArrayList<HeroAlbum> heroAlbumArrayList) {

        recyclerView = findViewById(R.id.recyclerViewXml);
        recyclerViewAdapter = new RecyclerViewAdapter(heroAlbumArrayList);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(recyclerViewAdapter);
        recyclerView.setLayoutManager(layoutManager);

        Log.d("TAG3", heroAlbumArrayList.get(2).getThumbnailUrl());


    }
}
