package com.example.androidtraining.retrofit.networkmanager;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitBuilder {
    private static Retrofit instance;

    private RetrofitBuilder() {
        // private constructor
    }

    public static Retrofit getInstance() {
        if (instance == null) {
            synchronized (RetrofitBuilder.class) {
                if (instance == null) {
                    instance = new Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/")
                            .addConverterFactory(GsonConverterFactory.create()).client(new OkHttpClient()).build();
                }
            }
        }
        return instance;
    }
}