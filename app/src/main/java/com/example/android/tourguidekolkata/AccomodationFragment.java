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
public class AccomodationFragment extends Fragment {


    public AccomodationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(getResources().getString(R.string.Heading_Hyatt_Regency_Kolkata),
                getResources().getString(R.string.Description_Hyatt_Regency_Kolkata), R.drawable.hayatt_regency_kolkata));
        tours.add(new Tour(getResources().getString(R.string.Heading_ITC_Sonar),
                getResources().getString(R.string.Description_ITC_Sonar), R.drawable.itc_sonar));
        tours.add(new Tour(getResources().getString(R.string.Heading_The_Oberoi_Grand),
                getResources().getString(R.string.Description_The_Oberoi_Grand), R.drawable.the_oberoi_grand));
        tours.add(new Tour(getResources().getString(R.string.Heading_The_Gateway_Hotel_EM_Bypass),
                getResources().getString(R.string.Description_The_Gateway_Hotel_EM_Bypass), R.drawable.the_gateway_hotel));
        tours.add(new Tour(getResources().getString(R.string.Heading_Tatvam_Residency),
                getResources().getString(R.string.Description_Tatvam_Residency), R.drawable.tatvam_residency));
        tours.add(new Tour(getResources().getString(R.string.Heading_Taj_Bengal_Kolkata),
                getResources().getString(R.string.Description_Taj_Bengal_Kolkata), R.drawable.taj_bengal_kolkata));
        tours.add(new Tour(getResources().getString(R.string.Heading_Novotel_Kolkata_Hotel_and_Residences),
                getResources().getString(R.string.Description_Novotel_Kolkata_Hotel_and_Residences), R.drawable.novotel));
        tours.add(new Tour(getResources().getString(R.string.Heading_Monotel_Luxury_Business_Hotel),
                getResources().getString(R.string.Description_Monotel_Luxury_Business_Hotel), R.drawable.monotel));
        tours.add(new Tour(getResources().getString(R.string.Heading_Senses_Hotel),
                getResources().getString(R.string.Description_Senses_Hotel), R.drawable.senses));
        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_accomodation);
        ListView listView = (ListView) rootView.findViewById(R.id.root_view);
        listView.setAdapter(adapter);
        return rootView;
    }

}
