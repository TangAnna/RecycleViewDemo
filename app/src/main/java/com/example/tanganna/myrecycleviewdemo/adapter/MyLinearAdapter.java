package com.example.tanganna.myrecycleviewdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.tanganna.myrecycleviewdemo.R;

/**
 * Created by TangAnna on 2017/7/6.
 */
public class MyLinearAdapter extends RecyclerView.Adapter<MyLinearAdapter.MyViewHolde> {

    private Context mContext;

    public MyLinearAdapter(Context context) {
        mContext = context;
    }

    @Override
    public MyViewHolde onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.linear_item, null);
        MyViewHolde holder = new MyViewHolde(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolde holder, int position) {
        if (position % 3 == 0) {
            holder.mImageView.setImageResource(R.mipmap.c);
        } else if (position % 3 == 1) {
            holder.mImageView.setImageResource(R.mipmap.d);
        } else {
            holder.mImageView.setImageResource(R.mipmap.e);
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
            mImageView = (ImageView) itemView.findViewById(R.id.iv_linear_item);
        }
    }
}
