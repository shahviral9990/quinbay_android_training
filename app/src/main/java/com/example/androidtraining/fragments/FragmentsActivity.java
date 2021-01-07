package com.example.androidtraining.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.androidtraining.R;

public class FragmentsActivity extends AppCompatActivity implements IActivityCommunicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragments);
        FragmentOne fragmentOne = new FragmentOne();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fl_container, fragmentOne);
        fragmentTransaction.commit();
    }

    @Override
    public void openFragmentTwo() {
        FragmentTwo fragmentTwo = new FragmentTwo();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fl_container, fragmentTwo);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}