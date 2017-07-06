package com.example.tanganna.myrecycleviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tanganna.myrecycleviewdemo.adapter.MyLinearAdapter;

public class LinearActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private LinearLayoutManager mManager;
    private MyLinearAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
        initView();
        initData();
        setData();
        setListener();
    }

    public void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_linear_body);
    }


    public void initData() {
        mManager = new LinearLayoutManager(this,1,false);
        mAdapter = new MyLinearAdapter(this);

    }


    public void setData() {
        mRecyclerView.setLayoutManager(mManager);
        mRecyclerView.setAdapter(mAdapter);

    }


    public void setListener() {

    }
}
