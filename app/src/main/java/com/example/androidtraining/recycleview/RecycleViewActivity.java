package com.example.androidtraining.recycleview;

import android.os.Bundle;
import android.widget.Toast;

import com.example.androidtraining.R;
import com.example.androidtraining.recycleview.adapter.RecyclerViewAdapter;
import com.example.androidtraining.recycleview.model.UserData;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleViewActivity extends AppCompatActivity implements RecyclerViewAdapter.UserDataInterface {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_view);
        List<UserData> userDataList = new ArrayList<>();
        generateUserData(userDataList);
        RecyclerView recyclerView = findViewById(R.id.recycle_view);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(userDataList, RecycleViewActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);

    }

    @Override
    public void onUserClick(UserData userData) {
        Toast.makeText(this, "Image Clicked for" + userData.getName(), Toast.LENGTH_SHORT).show();
    }

    private void generateUserData(List<UserData> userDataList) {
        userDataList.add(new UserData("Employee 1", "https://fortmyersradon.com/wp-content/uploads/2019/12/dummy-user-img-1.png", true));
        userDataList.add(new UserData("Employee 2", "https://d2cax41o7ahm5l.cloudfront.net/mi/speaker-photo/appliedmicrobiology-minl-2018-Rucha-Ridhorkar-62007-7135.png", false));
        userDataList.add(new UserData("Employee 3", "https://img.icons8.com/bubbles/2x/user-male.png", false));
        userDataList.add(new UserData("Employee 4", "https://cdn4.iconfinder.com/data/icons/small-n-flat/24/user-alt-512.png", true));
        userDataList.add(new UserData("Employee 5", "https://toppng.com/uploads/preview/user-font-awesome-nuevo-usuario-icono-11563566658mjtfvilgcs.png", false));
        userDataList.add(new UserData("Employee 6", "https://image.flaticon.com/icons/png/512/149/149071.png", true));
        userDataList.add(new UserData("Employee 7", "https://www.winhelponline.com/blog/wp-content/uploads/2017/12/user.png", true));
        userDataList.add(new UserData("Employee 8", "https://avatarfiles.alphacoders.com/791/79102.png", true));
        userDataList.add(new UserData("Employee 9", "https://i.pinimg.com/originals/7c/c7/a6/7cc7a630624d20f7797cb4c8e93c09c1.png", true));
        userDataList.add(new UserData("Employee 10", "https://cdn1.iconfinder.com/data/icons/avatar-2-2/512/Casual_Man_2-512.png", false));
        userDataList.add(new UserData("Employee 11", "https://img.icons8.com/plasticine/2x/user.png", false));
        userDataList.add(new UserData("Employee 12", "https://img.pngio.com/user-account-google-account-start-up-computer-icons-others-user-account-png-800_848.png", true));
        userDataList.add(new UserData("Employee 13", "https://spng.subpng.com/20180331/pke/kisspng-computer-icons-user-profile-female-avatar-user-5abff415c1e818.9933493415225293017943.jpg", false));
        userDataList.add(new UserData("Employee 14", "https://top-madagascar.com/assets/images/admin/user-admin.png", true));
        userDataList.add(new UserData("Employee 15", "https://img.favpng.com/0/15/16/computer-icons-scalable-vector-graphics-user-portable-network-graphics-png-favpng-BX7ftAQrVPmfvYJPu42ac8Fhj_t.jpg", false));
        userDataList.add(new UserData("Employee 16", "https://www.iconeasy.com/icon/png/System/Junior/user%20group.png", true));
    }
}