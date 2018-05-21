package com.example.adriana.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CityAttractionAdapter extends ArrayAdapter<CityAttraction> {
    private ArrayList<CityAttraction> event;
    Context context;

    public CityAttractionAdapter(ArrayList<CityAttraction> event, Context context) {
        super(context, R.layout.list_item, event);
        this.event = event;
        this.context = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        CityAttraction currentCityAttraction = getItem(position);

        ImageView eventImage = listItemView.findViewById(R.id.image);
        eventImage.setImageResource(currentCityAttraction.getImage());

        TextView eventName = listItemView.findViewById(R.id.name);
        eventName.setText(currentCityAttraction.getName());

        TextView eventLocation = listItemView.findViewById(R.id.location);
        eventLocation.setText(currentCityAttraction.getLocation());

        return listItemView;
    }
}
