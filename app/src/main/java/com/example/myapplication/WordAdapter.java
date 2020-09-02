package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;


public class WordAdapter extends ArrayAdapter<MovieModel> {
    public WordAdapter(ArrayList<MovieModel> objects, Context context) {
        super(context, 0, objects);
    }


    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list, parent, false);
        }
        MovieModel movieModel = getItem(position);
        TextView name = listItemView.findViewById(R.id.textView3);
        TextView title = listItemView.findViewById(R.id.textView4);
        name.setText(movieModel.getName());
        title.setText(movieModel.getDate());
        return listItemView;
    }
}

