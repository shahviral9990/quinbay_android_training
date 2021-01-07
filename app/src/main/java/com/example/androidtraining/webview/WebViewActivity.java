package com.example.androidtraining.webview;

import android.os.Bundle;
import android.webkit.WebView;

import com.example.androidtraining.R;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        WebView webView = findViewById(R.id.web_view);
        webView.loadUrl("https://www.google.com/");
    }
}