package com.example.tanganna.myrecycleviewdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.tanganna.myrecycleviewdemo.R;

import java.util.Random;

/**
 * Created by TangAnna on 2017/7/6.
 */
public class MyGridAdapter extends RecyclerView.Adapter<MyGridAdapter.MyViewHolde> {

    private Context mContext;

    public MyGridAdapter(Context context) {
        mContext = context;
    }

    @Override
    public MyViewHolde onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.grid_item, null);
        MyViewHolde holder = new MyViewHolde(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolde holder, int position) {
        if (position % 2 == 0) {
            holder.mImageView.setImageResource(R.mipmap.j);
        } else if (position % 5 == 0) {
            holder.mImageView.setImageResource(R.mipmap.h);
        } else {
            holder.mImageView.setImageResource(R.mipmap.f);
        }

    }

    @Override
    public int getItemCount() {
        return 100;
    }

    class MyViewHolde extends RecyclerView.ViewHolder {

        public ImageView mImageView;

        public MyViewHolde(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.iv_grid_item);
        }
    }
}
