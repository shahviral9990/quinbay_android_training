package com.example.androidtraining.retrofit.network;

import com.example.androidtraining.retrofit.model.Response;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IPostApi {

    @GET("posts")
    Call<List<Response>> getPosts();
}
