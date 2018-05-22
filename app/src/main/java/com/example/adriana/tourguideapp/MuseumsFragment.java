package com.example.adriana.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class MuseumsFragment extends Fragment {

    public MuseumsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<CityAttraction> museums = new ArrayList<>();

        museums.add(new CityAttraction(R.mipmap.gusti, getResources().getString(R.string.gusti), getResources().getString(R.string.gusti_address)));
        museums.add(new CityAttraction(R.mipmap.art, getResources().getString(R.string.art), getResources().getString(R.string.art_address)));
        museums.add(new CityAttraction(R.mipmap.history, getResources().getString(R.string.history), getResources().getString(R.string.history_address)));
        museums.add(new CityAttraction(R.mipmap.peasant, getResources().getString(R.string.peasant), getResources().getString(R.string.peasant_address)));
        museums.add(new CityAttraction(R.mipmap.zambaccian, getResources().getString(R.string.zambaccian), getResources().getString(R.string.zambaccian_address)));

        CityAttractionAdapter adapter = new CityAttractionAdapter(museums, getContext());
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
