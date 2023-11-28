package com.example.blackcofferdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView refine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         refine = findViewById(R.id.refine);



        RecyclerView recyclerView = findViewById(R.id.mainRv);

        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Aditya Simant","Hyderabad | India", "0 Km", "Coffee | Business | Friendship",
                "Hey there! This is a demo app","AS"));
        items.add(new Item("Aditya Simant","Hyderabad | India", "0 Km", "Coffee | Business | Friendship",
                "Hey there! This is a demo app","AS"));
        items.add(new Item("Aditya Simant","Hyderabad | India", "0 Km", "Coffee | Business | Friendship",
                "Hey there! This is a demo app","AS"));
        items.add(new Item("Aditya Simant","Hyderabad | India", "0 Km", "Coffee | Business | Friendship",
                "Hey there! This is a demo app","AS"));
        items.add(new Item("Aditya Simant","Hyderabad | India", "0 Km", "Coffee | Business | Friendship",
                "Hey there! This is a demo app","AS"));
        items.add(new Item("Aditya Simant","Hyderabad | India", "0 Km", "Coffee | Business | Friendship",
                "Hey there! This is a demo app","AS"));
        items.add(new Item("Aditya Simant","Hyderabad | India", "0 Km", "Coffee | Business | Friendship",
                "Hey there! This is a demo app","AS"));
        items.add(new Item("Aditya Simant","Hyderabad | India", "0 Km", "Coffee | Business | Friendship",
                "Hey there! This is a demo app","AS"));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new CardAdapter(getApplicationContext(),items));

        refine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, refineActivity.class);
                startActivity(intent);
            }
        });

    }


}