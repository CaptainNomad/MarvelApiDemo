package com.example.marvelapidemo.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.marvelapidemo.Adapters.ComicAdapter;
import com.example.marvelapidemo.ComicModel.ComicPrice;
import com.example.marvelapidemo.ItemClasses.ComicItem;
import com.example.marvelapidemo.ComicModel.Comic;
import com.example.marvelapidemo.ComicModel.ComicDataWrapper;
import com.example.marvelapidemo.ComicModel.Image;
import com.example.marvelapidemo.JsonPlaceHolderAPI;
import com.example.marvelapidemo.R;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ComicFragment extends Fragment {
    RecyclerView recyclerView;
    JsonPlaceHolderAPI placeHolderAPI;

    private RecyclerView.Adapter mAdapter;
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;

    List<ComicItem> itemList;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comic, container, false);

        mRecyclerView = view.findViewById(R.id.recycler);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        //initData();

        itemList = new ArrayList<>();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://gateway.marvel.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        placeHolderAPI = retrofit.create(JsonPlaceHolderAPI.class);

        Call<ComicDataWrapper> call = placeHolderAPI.loadComics(1, "204ad1dd7f733383a3aff49f9a1976e6", "e0bc4a9af962c22fc81cc8c00eb37ef0");
        call.enqueue(new Callback<ComicDataWrapper>() {
            @Override
            public void onResponse(Call<ComicDataWrapper> call, Response<ComicDataWrapper> response) {
                if (!response.isSuccessful()) {
                    //textView.setText("Code: " + response.code());
                    Toast.makeText(getContext(), "Code: " + response.code(), Toast.LENGTH_LONG).show();
                } else {
                    String name="";
                    String image = "";
                    float price = 0;
                    String summary = "";

                    Comic[] comics = response.body().getData().getResults();

                    for (Comic comic : comics) {
                        name = comic.getTitle();
                        summary = comic.getDescription();

                        ComicPrice[] prices = comic.getPrices();

                        for (ComicPrice comicPrice : prices) {
                            price = comicPrice.getPrice();
                        }

                        summary = comic.getDescription();

                        Image img = comic.getThumbnail();
                        image = img.getPath() + "." + img.getExtension();

                        itemList.add(new ComicItem(image, name, price, summary));
                        mAdapter.notifyDataSetChanged();
                    }
                }
            }

            @Override
            public void onFailure(Call<ComicDataWrapper> call, Throwable t) {
                //textView.setText("Failure: " + t.getMessage());
            }
        });

        mAdapter = new ComicAdapter(itemList);
        mRecyclerView.setAdapter(mAdapter);

        // Inflate the layout for this fragment
        return view;
    }
}
