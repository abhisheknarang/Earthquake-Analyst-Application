package com.example.android.quakereport;

/**
 * Created by ABHISHEK NARANG on 06-08-2017.
 */

public class Earthquake {
    private Double mMagnitude;
    private String mLocation;
    private String mDate;
    private long mTimeInMilliseconds;

    public Earthquake(Double magnitude, String location, long timeInMilliseconds) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
    }
    public Double getMagnitude(){
        return mMagnitude;
    }
    public String getLocation(){
        return mLocation;
    }
    public String getDate(){
        return mDate;
    }
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
