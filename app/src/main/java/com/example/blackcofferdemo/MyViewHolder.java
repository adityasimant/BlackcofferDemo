package com.example.blackcofferdemo;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView name, location, distance, tagline, description, photo;
    public MyViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.name);
        location = itemView.findViewById(R.id.location);
        distance = itemView.findViewById(R.id.distance);
        tagline = itemView.findViewById(R.id.tagline);
        description = itemView.findViewById(R.id.decription);
        photo = itemView.findViewById(R.id.twowordsvg);

    }
}
