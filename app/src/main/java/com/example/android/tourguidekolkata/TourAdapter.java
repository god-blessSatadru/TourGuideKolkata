package com.example.android.tourguidekolkata;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by baba on 9/5/2016.
 */
public class TourAdapter extends ArrayAdapter<Tour> {
    Tour tour;
    int mColorResourceId;

    public TourAdapter(Activity context, ArrayList<Tour> tour, int colorResourceId) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews and an ImageView, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, tour);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@linkTour} object located at this position in the list
        tour = getItem(position);
        // Find the TextView in the list_item.xml layout with the Heading
        TextView mHeading = (TextView) listItemView.findViewById(R.id.Heading);
        if (tour.hasHeading()) {  // Get the version name from the current Tour object and
            // set this text on the name TextView
            mHeading.setText(tour.getHeading());
            mHeading.setVisibility(View.VISIBLE);
        } else
            mHeading.setVisibility(View.GONE);
        TextView mDescription = (TextView) listItemView.findViewById(R.id.Description);
        mDescription.setText(tour.getDescriptionn());
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        if (tour.hasImage()) {

            image.setImageResource(tour.getmImageResourceId());
            image.setVisibility(View.VISIBLE);
        } else {
            image.setVisibility(View.GONE);
        }
        // Set the theme color for the list item
        View textContainer = (View) listItemView.findViewById(R.id.text_control);
        // Find the color that the resource ID maps to
        // Set the background color of the text container View
        textContainer.setBackgroundColor(ContextCompat.getColor(getContext(), mColorResourceId));
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
