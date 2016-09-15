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
public class DinningFragment extends Fragment {


    public DinningFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(getResources().getString(R.string.Heading_Aaheli),
                getResources().getString(R.string.Description_Aaheli), R.drawable.aaheli));
        tours.add(new Tour(getResources().getString(R.string.Heading_Arsalan),
                getResources().getString(R.string.Description_Arsalan), R.drawable.arsalan));
        tours.add(new Tour(getResources().getString(R.string.Heading_Baan_Thai),
                getResources().getString(R.string.Description_Baan_Thai), R.drawable.bann_thai));
        tours.add(new Tour(getResources().getString(R.string.Heading_Bar_B_Q),
                getResources().getString(R.string.Description_Bar_B_Q), R.drawable.bar_b_q));
        tours.add(new Tour(getResources().getString(R.string.Heading_Ballygunge_Place_6),
                getResources().getString(R.string.Description_Ballygunge_Place_6), R.drawable.ballygunge_place));
        tours.add(new Tour(getResources().getString(R.string.Heading_Dum_Pukht),
                getResources().getString(R.string.Description_Dum_Pukht), R.drawable.uum_pukht));
        tours.add(new Tour(getResources().getString(R.string.Heading_Mocambo),
                getResources().getString(R.string.Description_Mocambo), R.drawable.mocambo));
        tours.add(new Tour(getResources().getString(R.string.Heading_Oh_Calcutta),
                getResources().getString(R.string.Description_Oh_Calcutta), R.drawable.oh_calcutta));
        tours.add(new Tour(getResources().getString(R.string.Heading_Peter_Cat),
                getResources().getString(R.string.Description_Peter_Cat), R.drawable.peter_cat));
        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_restaurants);
        ListView listView = (ListView) rootView.findViewById(R.id.root_view);
        listView.setAdapter(adapter);
        return rootView;
    }

}
