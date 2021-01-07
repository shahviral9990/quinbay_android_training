package com.example.androidtraining.retrofit;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.androidtraining.R;
import com.example.androidtraining.retrofit.model.Response;
import com.example.androidtraining.retrofit.network.IPostApi;
import com.example.androidtraining.retrofit.networkmanager.RetrofitBuilder;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Retrofit;

public class RetrofitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        initApi();
    }

    private void initApi() {
        Retrofit retrofit = RetrofitBuilder.getInstance();
        IPostApi iPostApi = retrofit.create(IPostApi.class);
        TextView tvResult = findViewById(R.id.tv_result);
        tvResult.setText("Loading...");
        Call<List<Response>> responses = iPostApi.getPosts();
        responses.enqueue(new Callback<List<Response>>() {
            @Override
            public void onResponse(Call<List<Response>> call, retrofit2.Response<List<Response>> response) {
                String result = "Data Count " + response.body().size();
                tvResult.setText(result);
            }

            @Override
            public void onFailure(Call<List<Response>> call, Throwable t) {
                Toast.makeText(RetrofitActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}