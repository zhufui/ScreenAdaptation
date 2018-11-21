package com.example.admin.screenadaptation.base;

import android.app.Application;

import com.example.admin.screenadaptation.utils.Density;

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Density.setDensity(this);
    }
}
