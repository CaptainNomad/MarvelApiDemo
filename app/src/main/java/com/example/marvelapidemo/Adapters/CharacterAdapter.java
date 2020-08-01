package com.example.marvelapidemo.Adapters;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.marvelapidemo.ItemClasses.CharacterItem;
import com.example.marvelapidemo.R;
import com.squareup.picasso.Picasso;

import java.net.URL;
import java.util.List;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.ViewHolder> {
    List<CharacterItem> itemListChar;

    public CharacterAdapter(List<CharacterItem> itemListChar) {
        this.itemListChar = itemListChar;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.character_item, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Picasso.get().load(itemListChar.get(position).getCharacterImage()).into(holder.characterImage);
        holder.characterName.setText(itemListChar.get(position).getCharacterName());
        holder.characterDescrp.setText(itemListChar.get(position).getCharacterDescrp());
    }


    @Override
    public int getItemCount() {
        return itemListChar.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView characterImage;
        public TextView characterName;
        public TextView characterDescrp;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            characterImage = itemView.findViewById(R.id.characterImage);
            characterName = itemView.findViewById(R.id.characterName);
            characterDescrp = itemView.findViewById(R.id.characterDescrp);
        }
    }
}
