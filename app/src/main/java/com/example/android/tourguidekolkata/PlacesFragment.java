package com.example.android.tourguidekolkata;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(getResources().getString(R.string.Heading_Eden_Gardens),
                getResources().getString(R.string.Description_Eden_Gardens), R.drawable.eden_gardens));
        tours.add(new Tour(getResources().getString(R.string.Heading_Eco_Tourism_Park),
                getResources().getString(R.string.Description_Eco_Tourism_Park), R.drawable.eco_tourism_park));
        tours.add(new Tour(getResources().getString(R.string.Heading_Dakshineswar_Kali_Temple),
                getResources().getString(R.string.Description_Dakshineswar_Kali_Temple), R.drawable.dakshineswar_kali_temple));
        tours.add(new Tour(getResources().getString(R.string.Heading_Birla_Temple),
                getResources().getString(R.string.Description_Birla_Temple), R.drawable.birla_mandir_kolkata));
        tours.add(new Tour(getResources().getString(R.string.Heading_Howrah_Bridge),
                getResources().getString(R.string.Description_Howrah_Bridge), R.drawable.the_howrah_bridge));
        tours.add(new Tour(getResources().getString(R.string.Heading_Victoria_Memorial_Hall),
                getResources().getString(R.string.Description_Victoria_Memorial_Hall), R.drawable.victoria_memorial_beauty));
        tours.add(new Tour(getResources().getString(R.string.Heading_South_Park_Street_Cemetery),
                getResources().getString(R.string.Description_South_Park_Street_Cemetery), R.drawable.south_cemetary));
        tours.add(new Tour(getResources().getString(R.string.Heading_Science_City),
                getResources().getString(R.string.Description_Science_City), R.drawable.science_city));
        tours.add(new Tour(getResources().getString(R.string.Heading_Mother_House),
                getResources().getString(R.string.Description_Mother_House), R.drawable.kolkata_motherhouse));
        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_places);
        ListView listView = (ListView) rootView.findViewById(R.id.root_view);
        listView.setAdapter(adapter);
        return rootView;
    }

}
