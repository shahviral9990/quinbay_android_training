package com.example.androidtraining.bottom_navigation;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.androidtraining.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class BottomNavigation extends AppCompatActivity {

    @SuppressLint("NonConstantResourceId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        FirstFragment firstFragment = new FirstFragment();
        SecondFragment secondFragment = new SecondFragment();
        ThirdFragment thirdFragment = new ThirdFragment();
        setCurrentFragment(firstFragment);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int id = item.getItemId();
            switch (id) {
                case R.id.person:
                    setCurrentFragment(secondFragment);
                    break;

                case R.id.settings:
                    setCurrentFragment(thirdFragment);
                    break;

                default:
                    setCurrentFragment(firstFragment);
                    break;
            }
            return true;
        });
    }

    private void setCurrentFragment(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.flFragment, fragment);
        fragmentTransaction.commit();
    }
}