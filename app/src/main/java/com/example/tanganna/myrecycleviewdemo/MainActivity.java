package com.example.tanganna.myrecycleviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtnStaggered, mBtnGrid, mBtnLinear;
    private Intent mIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        setData();
        setListener();
    }


    public void initView() {
        mBtnStaggered = (Button) findViewById(R.id.btn_main_staggered);
        mBtnGrid = (Button) findViewById(R.id.btn_main_grid);
        mBtnLinear = (Button) findViewById(R.id.btn_main_linear);

    }


    public void initData() {

    }


    public void setData() {

    }


    public void setListener() {
        mBtnStaggered.setOnClickListener(this);
        mBtnGrid.setOnClickListener(this);
        mBtnLinear.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_main_grid:
                mIntent = new Intent(this, GridActivity.class);
                break;
            case R.id.btn_main_linear:
                mIntent = new Intent(this, LinearActivity.class);
                break;
            case R.id.btn_main_staggered:
                mIntent = new Intent(this, StaggeredActivity.class);
                break;
        }
        if (mIntent != null) {
            startActivity(mIntent);
        }
    }
}
