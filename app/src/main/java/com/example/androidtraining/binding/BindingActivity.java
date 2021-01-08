package com.example.androidtraining.binding;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.androidtraining.R;

import androidx.appcompat.app.AppCompatActivity;

public class BindingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binding);
        Button button = (Button) findViewById(R.id.bt_toast);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(BindingActivity.this, "Button Clicked!", Toast.LENGTH_LONG).show();
            }
        });
    }
}