package com.example.tanganna.myrecycleviewdemo.adapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
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
public class MyStaggeredAdapter extends RecyclerView.Adapter<MyStaggeredAdapter.MyViewHolde>{

    private Context mContext;

    public MyStaggeredAdapter(Context context) {
        mContext = context;
    }

    @Override
    public MyViewHolde onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.staggered_item,null);
        MyViewHolde holder = new MyViewHolde(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolde holder, int position) {
        Random random = new Random();
        int i = random.nextInt(101) + 200;
        holder.mImageView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,i));
        if (position %4 == 0 || position %4 == 3){
            holder.mImageView.setImageResource(R.mipmap.a);
        }else {
            holder.mImageView.setImageResource(R.mipmap.b);
        }

    }

    @Override
    public int getItemCount() {
        return 100;
    }

    class MyViewHolde extends RecyclerView.ViewHolder{

        public ImageView mImageView;
        public MyViewHolde(View itemView) {
            super(itemView);
            mImageView = (ImageView) itemView.findViewById(R.id.iv_staggered_item);
        }
    }
}
