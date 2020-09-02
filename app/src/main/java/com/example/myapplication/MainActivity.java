package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<MovieModel> words = new ArrayList<>();
        words.add(new MovieModel("abdo","a7a"));
        words.add(new MovieModel("abdo","a7a"));
        words.add(new MovieModel("abdo","a7a"));
        words.add(new MovieModel("abdo","a7a"));
        final ArrayAdapter adapter = new WordAdapter(words, this);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }




}