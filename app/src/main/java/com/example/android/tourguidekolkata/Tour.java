package com.example.android.tourguidekolkata;

/**
 * Created by baba on 9/5/2016.
 */
public class Tour {
    private static final int NO_IMAGE_PROVIDED = -1;
    private static final int NO_HEADING_PROVIDED = -1;
    private String mHeading;
    private String mDescription;
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    private int mHeadingResourceId = NO_HEADING_PROVIDED;

    public Tour(String mHeading, String mDescription, int mImageResourceId) {
        this.mHeading = mHeading;
        this.mDescription = mDescription;
        this.mImageResourceId = mImageResourceId;
    }

    public Tour(String mDescription) {
        this.mDescription = mDescription;

    }

    public String getHeading() {
        return mHeading;
    }

    public String getDescriptionn() {
        return mDescription;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public boolean hasHeading() {
        return mHeadingResourceId != NO_HEADING_PROVIDED;
    }
}
