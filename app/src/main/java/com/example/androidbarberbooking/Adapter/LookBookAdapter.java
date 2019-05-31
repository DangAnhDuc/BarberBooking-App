package com.example.androidbarberbooking.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.androidbarberbooking.Model.Banner;
import com.example.androidbarberbooking.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class LookBookAdapter extends RecyclerView.Adapter<LookBookAdapter.MyViewHolder> {
    Context context;
    List<Banner> lookbooks;

    public LookBookAdapter(Context context, List<Banner> lookbooks) {
        this.context = context;
        this.lookbooks = lookbooks;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.layout_look_book,viewGroup,false);
        return  new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Picasso.get().load(lookbooks.get(i).getImage()).into(myViewHolder.imageView);
    }

    @Override
    public int getItemCount() {
        return lookbooks.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        public  MyViewHolder(@NonNull View itemView){
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.image_look__book);
        }
    }
}
