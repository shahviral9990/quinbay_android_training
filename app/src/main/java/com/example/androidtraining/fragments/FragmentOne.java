package com.example.androidtraining.fragments;

import android.content.Context;
import android.os.Bundle;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.androidtraining.R;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class FragmentOne extends Fragment {

    private IActivityCommunicator mIActivityCommunicator;
    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if(context instanceof IActivityCommunicator){
            mIActivityCommunicator = (IActivityCommunicator) context;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_one, container, false);
        Button button = view.findViewById(R.id.bt_open);
        button.setOnClickListener(view1 -> {
            if(null != mIActivityCommunicator){
                mIActivityCommunicator.openFragmentTwo();
            }
        });
        return view;
    }
}