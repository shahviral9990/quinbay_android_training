package com.example.androidtraining;

import android.content.Intent;
import android.os.Bundle;

import com.example.androidtraining.binding.BindingActivity;
import com.example.androidtraining.cardview.CardViewActivity;
import com.example.androidtraining.constraintlayout.ConstraintLayoutActivity;
import com.example.androidtraining.fragments.FragmentsActivity;
import com.example.androidtraining.framelayout.FrameLayoutActivity;
import com.example.androidtraining.glide.GlideActivity;
import com.example.androidtraining.intents.IntentsActivity;
import com.example.androidtraining.lifecycle.LifecycleActivity;
import com.example.androidtraining.linearlayout.LinearLayoutActivity;
import com.example.androidtraining.recycleview.RecycleViewActivity;
import com.example.androidtraining.retrofit.RetrofitActivity;
import com.example.androidtraining.sharedpreferences.SharedPreferencesActivity;
import com.example.androidtraining.webview.WebViewActivity;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickListeners();
    }

    private void clickListeners() {
        findViewById(R.id.life_cycle).setOnClickListener(view -> startActivity(new Intent(this, LifecycleActivity.class)));
        findViewById(R.id.linear_layout).setOnClickListener(view -> startActivity(new Intent(this, LinearLayoutActivity.class)));
        findViewById(R.id.frame_layout).setOnClickListener(view -> startActivity(new Intent(this, FrameLayoutActivity.class)));
        findViewById(R.id.card_view).setOnClickListener(view -> startActivity(new Intent(this, CardViewActivity.class)));
        findViewById(R.id.web_view).setOnClickListener(view -> startActivity(new Intent(this, WebViewActivity.class)));
        findViewById(R.id.constraint_layout).setOnClickListener(view -> startActivity(new Intent(this, ConstraintLayoutActivity.class)));
        findViewById(R.id.intents).setOnClickListener(view -> startActivity(new Intent(this, IntentsActivity.class)));

        findViewById(R.id.bindings).setOnClickListener(view -> startActivity(new Intent(this, BindingActivity.class)));
        findViewById(R.id.shared_preference).setOnClickListener(view -> startActivity(new Intent(this, SharedPreferencesActivity.class)));
        findViewById(R.id.retrofit).setOnClickListener(view -> startActivity(new Intent(this, RetrofitActivity.class)));
        findViewById(R.id.glide).setOnClickListener(view -> startActivity(new Intent(this, GlideActivity.class)));
        findViewById(R.id.recycle_view).setOnClickListener(view -> startActivity(new Intent(this, RecycleViewActivity.class)));
        findViewById(R.id.fragments).setOnClickListener(view -> startActivity(new Intent(this, FragmentsActivity.class)));
    }
}