package com.example.androidtraining.intents;

import android.os.Bundle;
import android.widget.TextView;

import com.example.androidtraining.R;
import com.example.androidtraining.intents.model.ParcelableModel;
import com.example.androidtraining.intents.model.SerializableModel;

import androidx.appcompat.app.AppCompatActivity;

public class ExplicitIntentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_explicit_intent);
        TextView textView = findViewById(R.id.tv_text);
        String totalText = "Total : " + (getIntent().getIntExtra("value1", 0) + getIntent().getIntExtra("value2", 0));
        SerializableModel serializableModel = (SerializableModel) getIntent().getSerializableExtra("serializableModel");
        ParcelableModel parcelableModel = getIntent().getParcelableExtra("parcelableModel");
        textView.setText(totalText);
    }
}