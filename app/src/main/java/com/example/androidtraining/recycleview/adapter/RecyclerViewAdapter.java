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

    private List<UserData> mUserDataList;
    private UserDataInterface mUserDataInterface;

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
        holder.textView.setText(userData.getName());
        Glide.with(holder.mImageView.getContext()).load(userData.getImageUrl()).placeholder(R.drawable.placeholder).into(holder.mImageView);
        holder.rootView.setOnClickListener((view -> {
            mUserDataInterface.onImageClick(userData);
        }));
    }

    @Override
    public int getItemCount() {
        return mUserDataList.size();
    }

    public interface UserDataInterface {
        void onImageClick(UserData userData);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        private final ImageView mImageView;
        private final View rootView;

        public ViewHolder(View view) {
            super(view);
            rootView = view;
            textView = view.findViewById(R.id.textView10);
            mImageView = view.findViewById(R.id.imageView);
        }

        public TextView getTextView() {
            return textView;
        }
    }
}
