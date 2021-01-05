package com.example.androidtraining;

import android.content.Intent;
import android.os.Bundle;

import com.example.androidtraining.binding.BindingActivity;
import com.example.androidtraining.cardview.CardViewActivity;
import com.example.androidtraining.constraintlayout.ConstraintLayoutActivity;
import com.example.androidtraining.framelayout.FrameLayoutActivity;
import com.example.androidtraining.lifecycle.LifecycleActivity;
import com.example.androidtraining.linearlayout.LinearLayoutActivity;
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
        findViewById(R.id.bindings).setOnClickListener(view -> startActivity(new Intent(this, BindingActivity.class)));
    }
}