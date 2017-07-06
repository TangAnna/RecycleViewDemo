package com.example.tanganna.myrecycleviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public abstract class MyBaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_base);
        initView();
        initData();
        setData();
        setListener();
    }
    public abstract void initView();

    public abstract void initData();

    public abstract void setData();

    public abstract void setListener();
}
