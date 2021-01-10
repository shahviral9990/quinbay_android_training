package com.example.androidtraining.recycleview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.androidtraining.R;
import com.example.androidtraining.recycleview.model.UserData;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private final List<UserData> mUserDataList;
    private final UserDataInterface mUserDataInterface;

    public RecyclerViewAdapter(List<UserData> userDataList, UserDataInterface mUserDataInterface) {
        this.mUserDataList = userDataList;
        this.mUserDataInterface = mUserDataInterface;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.user_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        UserData userData = mUserDataList.get(position);
        holder.tvName.setText(userData.getName());
        Glide.with(holder.ivProfile.getContext()).load(userData.getImageUrl()).placeholder(R.drawable.placeholder).into(holder.ivProfile);
        holder.rootView.setOnClickListener((view -> mUserDataInterface.onUserClick(userData)));
        if (userData.isDeveloper()) {
            holder.ivDev.setVisibility(View.VISIBLE);
        } else {
            holder.ivDev.setVisibility(View.GONE);
        }
    }

    @Override
    public int getItemCount() {
        return mUserDataList.size();
    }

    public interface UserDataInterface {
        void onUserClick(UserData userData);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tvName;
        private final ImageView ivProfile;
        private final View rootView;
        private final ImageView ivDev;

        public ViewHolder(View view) {
            super(view);
            rootView = view;
            tvName = view.findViewById(R.id.tv_name);
            ivProfile = view.findViewById(R.id.iv_profile);
            ivDev = view.findViewById(R.id.iv_dev);
        }

    }
}
