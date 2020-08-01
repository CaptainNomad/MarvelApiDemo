package com.example.marvelapidemo;

import com.example.marvelapidemo.CharacterModel.CharacterDataWrapper;
import com.example.marvelapidemo.ComicModel.ComicDataWrapper;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface JsonPlaceHolderAPI {
    @GET("/v1/public/characters")
    Call<CharacterDataWrapper> loadCharacters(@Query("ts") int ts, @Query("apikey") String apikey, @Query("hash") String hash);


    @GET("/v1/public/comics")
    Call<ComicDataWrapper> loadComics(@Query("ts") int ts, @Query("apikey") String apikey, @Query("hash") String hash);
}
