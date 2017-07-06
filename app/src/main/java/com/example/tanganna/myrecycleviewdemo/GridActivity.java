package com.example.tanganna.myrecycleviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.tanganna.myrecycleviewdemo.adapter.MyGridAdapter;

public class GridActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private GridLayoutManager mManager;
    private MyGridAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        initView();
        initData();
        setData();
        setListener();
    }


    public void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_grid_body);
    }


    public void initData() {
        mManager = new GridLayoutManager(this,3, LinearLayoutManager.VERTICAL,false);
        mAdapter = new MyGridAdapter(this);

    }


    public void setData() {
        mRecyclerView.setLayoutManager(mManager);
        mRecyclerView.setAdapter(mAdapter);
        SpacesItemDecoration decoration = new SpacesItemDecoration(16);
        mRecyclerView.addItemDecoration(decoration);

    }


    public void setListener() {

    }
}
