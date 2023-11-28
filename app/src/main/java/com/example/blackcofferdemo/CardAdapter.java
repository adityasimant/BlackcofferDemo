package com.example.blackcofferdemo;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<Item> items;

    public CardAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.name.setText(items.get(position).getName());
        holder.location.setText(items.get(position).getLocation());
        holder.tagline.setText(items.get(position).getTagLine());
        holder.description.setText(items.get(position).getDescription());
        holder.distance.setText(items.get(position).getDistance());
        holder.photo.setText(items.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
