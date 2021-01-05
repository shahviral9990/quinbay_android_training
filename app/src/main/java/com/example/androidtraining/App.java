package com.example.androidtraining;

import android.app.Application;

public class App extends Application {

    private static App singleton;

    public App getInstance() {
        return singleton;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        singleton = this;
    }
}
