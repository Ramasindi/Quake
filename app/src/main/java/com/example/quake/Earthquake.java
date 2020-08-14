package com.example.quake;

public class Earthquake {

    private String mMagnitude;
    private String mCity;
    private String mDate;

    /**
     * @param magnitude is the double variable for the magnitude of the quake
     * @param city is the name of the city that experienced the quake
     * @param date is the variable that takes the date of quake occurrence
     * */
    public Earthquake(String magnitude, String city, String date){
        mMagnitude = magnitude;
        mCity = city;
        mDate = date;

    }
    /**
     * Method returns the magnitude of the earthquake
     * */
    public String getMagnitude(){
        return mMagnitude;
    }
    /**
     * Method returns the name of the city where the quake occurred
     * */
    public  String getCity(){
        return mCity;
    }
    /**
     * Method returns the date in which the quake occurred
     * */
    public String getDate(){
        return mDate;
    }
}
