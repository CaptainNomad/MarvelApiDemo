package com.example.marvelapidemo.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marvelapidemo.ItemClasses.ComicItem;
import com.example.marvelapidemo.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ComicAdapter extends RecyclerView.Adapter<ComicAdapter.ViewHolder> {
    List<ComicItem> itemList;

    public ComicAdapter(List<ComicItem> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.comic_item, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final ComicItem item = itemList.get(position);
        Picasso.get().load(item.getComicImg()).into(holder.comicImg);
        holder.comicText.setText(item.getComicText());
        holder.comicSummary.setText(item.getComicSummary());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView comicImg;
        public TextView comicText;
        public TextView comicSummary;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            comicImg = itemView.findViewById(R.id.comicImg);
            comicText = itemView.findViewById(R.id.comicText);
            comicSummary = itemView.findViewById(R.id.comicDescrp);
        }
    }
}
