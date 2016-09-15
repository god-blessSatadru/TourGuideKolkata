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
public class SeasonFragment extends Fragment {


    public SeasonFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);
        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(getResources().getString(R.string.Season)));
        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.category_season);
        ListView listView = (ListView) rootView.findViewById(R.id.root_view);
        listView.setAdapter(adapter);
        return rootView;
    }

}
