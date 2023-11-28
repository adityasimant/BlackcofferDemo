package com.example.blackcofferdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;

public class refineActivity extends AppCompatActivity {


    String[] items = {"Available | Hey Let us connect",
    "Away | Stay Discrete And Watch",
    "Busy | Do not disturb | Will catch up later",
    "SOS | Emergency Need Assistance HELP"};


    ImageView back;
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refine);
        back = findViewById(R.id.back);
        autoCompleteTextView = findViewById(R.id.autotext);
        adapterItems = new ArrayAdapter<String>(this, R.layout.list_items, items);

        autoCompleteTextView.setAdapter(adapterItems);
        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String items = adapterView.getItemAtPosition(i).toString();
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =  new Intent(refineActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });


    }
}