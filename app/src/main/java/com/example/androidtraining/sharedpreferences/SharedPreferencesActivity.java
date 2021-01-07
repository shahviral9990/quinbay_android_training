package com.example.androidtraining.sharedpreferences;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.androidtraining.R;

import androidx.appcompat.app.AppCompatActivity;

public class SharedPreferencesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);
        EditText etKey = findViewById(R.id.et_add_key);
        EditText etName = findViewById(R.id.et_add_name);
        EditText etGetKey = findViewById(R.id.et_key);
        TextView tvGetValue = findViewById(R.id.tv_result);
        SharedPreferences sharedpreferences = getSharedPreferences("com.example.androidtraining", Context.MODE_PRIVATE);
        findViewById(R.id.bt_add).setOnClickListener(view -> {
            SharedPreferences.Editor editor = sharedpreferences.edit();
            editor.putString(etKey.getText().toString(), etName.getText().toString());
            editor.apply();
        });
        findViewById(R.id.bt_get).setOnClickListener(view -> {
            tvGetValue.setText(sharedpreferences.getString(etGetKey.getText().toString(), "default"));
        });
    }
}