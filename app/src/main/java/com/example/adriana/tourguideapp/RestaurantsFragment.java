package com.example.adriana.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<CityAttraction> restaurants = new ArrayList<CityAttraction>();

        restaurants.add(new CityAttraction(R.drawable.fork_knife_logo, getResources().getString(R.string.artist), getResources().getString(R.string.artist_address)));
        restaurants.add(new CityAttraction(R.drawable.fork_knife_logo, getResources().getString(R.string.bistrot), getResources().getString(R.string.bistrot_address)));
        restaurants.add(new CityAttraction(R.drawable.fork_knife_logo, getResources().getString(R.string.steakhouse), getResources().getString(R.string.steakhouse_address)));
        restaurants.add(new CityAttraction(R.drawable.fork_knife_logo, getResources().getString(R.string.modigliani), getResources().getString(R.string.modigliani_address)));
        restaurants.add(new CityAttraction(R.drawable.fork_knife_logo, getResources().getString(R.string.pescarus), getResources().getString(R.string.pescarus_address)));

        CityAttractionAdapter adapter = new CityAttractionAdapter(restaurants, getContext());
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
