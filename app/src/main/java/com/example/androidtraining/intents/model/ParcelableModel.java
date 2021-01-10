package com.example.androidtraining.intents.model;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableModel implements Parcelable {

    public static final Parcelable.Creator<ParcelableModel> CREATOR
            = new Parcelable.Creator<ParcelableModel>() {
        public ParcelableModel createFromParcel(Parcel in) {
            return new ParcelableModel(in);
        }

        public ParcelableModel[] newArray(int size) {
            return new ParcelableModel[size];
        }
    };
    String name;

    public ParcelableModel(String name) {
        this.name = name;
    }

    private ParcelableModel(Parcel in) {
        this.name = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
    }
}