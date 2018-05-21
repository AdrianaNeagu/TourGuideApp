package com.example.adriana.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LandmarksFragment extends Fragment {

    public LandmarksFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list, container, false);

        final ArrayList<CityAttraction> landmark = new ArrayList<>();

        landmark.add(new CityAttraction(R.drawable.palace_parliament, getResources().getString(R.string.parliament), getResources().getString(R.string.parliament_address)));
        landmark.add(new CityAttraction(R.drawable.cec_palace, getResources().getString(R.string.cecul), getResources().getString(R.string.cecul_address)));
        landmark.add(new CityAttraction(R.drawable.athenaeum, getResources().getString(R.string.athenaeum), getResources().getString(R.string.athenaeum_address)));
        landmark.add(new CityAttraction(R.drawable.triumph_arch, getResources().getString(R.string.triumph), getResources().getString(R.string.triumph_address)));
        landmark.add(new CityAttraction(R.drawable.stavropoleos, getResources().getString(R.string.stavropoleos), getResources().getString(R.string.stavropoleos_address)));

        CityAttractionAdapter adapter = new CityAttractionAdapter(landmark, getContext());
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
        return rootView;
    }

}
