package com.example.androidtraining.intents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.example.androidtraining.R;

import androidx.appcompat.app.AppCompatActivity;

public class IntentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intents);
        findViewById(R.id.implicit_intent).setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            intent.setData(Uri.parse("https://www.quinbay.com"));
            startActivity(intent);
        });
        findViewById(R.id.explicit_intent).setOnClickListener(view -> {
            Intent intent = new Intent(this, ExplicitIntentActivity.class);
            intent.putExtra("value1", 1);
            intent.putExtra("value2", 3);
            startActivity(intent);
        });
    }
}