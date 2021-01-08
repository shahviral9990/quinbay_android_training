package com.example.androidtraining.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.example.androidtraining.R;
import com.example.androidtraining.recycleview.adapter.RecyclerViewAdapter;
import com.example.androidtraining.recycleview.model.UserData;

import java.util.ArrayList;
import java.util.List;

public class RecycleViewActivity extends AppCompatActivity implements RecyclerViewAdapter.UserDataInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        List<UserData> userDataList = new ArrayList<>();
        for (int iterator = 0; iterator < 10; iterator++) {
            UserData userData;
            if (iterator % 2 == 0) {
                userData = new UserData("Employee" + " " + iterator, "https://fortmyersradon.com/wp-content/uploads/2019/12/dummy-user-img-1.png");
            } else {
                userData = new UserData("Employee" + " " + iterator, "https://d2cax41o7ahm5l.cloudfront.net/mi/speaker-photo/appliedmicrobiology-minl-2018-Rucha-Ridhorkar-62007-7135.png");
            }
            userDataList.add(userData);
        }
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(userDataList, RecycleViewActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);

    }

    @Override
    public void onUserClick(UserData userData) {
        Toast.makeText(this, "Image Clicked for" + userData.getName(), Toast.LENGTH_SHORT).show();
    }
}