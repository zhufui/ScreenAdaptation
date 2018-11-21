package com.example.admin.screenadaptation.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.admin.screenadaptation.utils.Density;

public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setOrientation();
        setContentView(getLayout());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    protected abstract int getLayout();

    /**
     * 一般使用默认的，也有些情况是使用的高度适配
     */
    public void setOrientation() {
        Density.setDefault(this);
    }
}
