package com.example.debugsandbox;


import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;



public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private ArrayList<HeroAlbum> HeroList;


    RecyclerViewAdapter(){}

    public RecyclerViewAdapter(ArrayList<HeroAlbum> AlbumList) {

        this.HeroList = AlbumList;

        Log.d("TAG5", AlbumList.get(1).getThumbnailUrl());
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        // bind views before super
        ImageView image;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            //bind to xml
            image = itemView.findViewById(R.id.displayImage);
        }
    }

    @NonNull @Override public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //need an inflater defined in order to properly inflate recyclerview
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View view = inflater.inflate( R.layout.recyclerview_items_cardview, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        HeroAlbum myHeroAlbum = HeroList.get(position);

        Log.d("TAG6", myHeroAlbum.getThumbnailUrl());
        //put content into the proper view

        Picasso.get().load(myHeroAlbum.getThumbnailUrl()).into(holder.image);
        //   Log.d("tag",HeroList.get(position).getThumbnailUrl());

        //
    }

    @Override
    public int getItemCount() {
        // controls the number of items displayed in the recyclerView
        //will return multiple instances of the same view if you do not have more
        return HeroList.size();
    }



}