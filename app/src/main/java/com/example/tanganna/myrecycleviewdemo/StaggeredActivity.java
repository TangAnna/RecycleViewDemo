package com.example.tanganna.myrecycleviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.tanganna.myrecycleviewdemo.adapter.MyStaggeredAdapter;

public class StaggeredActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private StaggeredGridLayoutManager mManager;
    private MyStaggeredAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staggered);
        initView();
        initData();
        setData();
        setListener();
    }


    public void initView() {
        mRecyclerView = (RecyclerView) findViewById(R.id.rv_staggered_body);
    }


    public void initData() {
        mAdapter = new MyStaggeredAdapter(this);
        mManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);

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
