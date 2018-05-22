package com.example.adriana.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ParksFragment extends Fragment {

    public ParksFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<CityAttraction> parks = new ArrayList<>();

        parks.add(new CityAttraction(R.mipmap.herastrau, getResources().getString(R.string.herastrau), getResources().getString(R.string.herastrau_address)));
        parks.add(new CityAttraction(R.mipmap.cuza, getResources().getString(R.string.cuza), getResources().getString(R.string.cuza_address)));
        parks.add(new CityAttraction(R.mipmap.cismigiu, getResources().getString(R.string.cismigiu), getResources().getString(R.string.cismigiu_address)));
        parks.add(new CityAttraction(R.mipmap.carol, getResources().getString(R.string.carol), getResources().getString(R.string.carol_address)));
        parks.add(new CityAttraction(R.mipmap.tineretului, getResources().getString(R.string.tineretului), getResources().getString(R.string.tineretului_address)));

        CityAttractionAdapter adapter = new CityAttractionAdapter(parks, getContext());
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
