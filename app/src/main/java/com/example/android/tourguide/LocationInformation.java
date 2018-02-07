package com.example.android.tourguide;

/**
 * Created by carlo on 1/11/18.
 */

public class LocationInformation {

    private String mTitle;
    private String mAddress;
    private String mPhoneNumber;
    private String mEmail;
    private String mWebsite;
    private String mDescription;
    private int mImageResource;
    private String mDate;
    private String mSource;

    // Constructor
    public LocationInformation(String title, String address, String description, String phoneNumber,
                               String email, String website, int imageResource, String source) {
        mTitle = title;
        mAddress = address;
        mDescription = description;
        mPhoneNumber = phoneNumber;
        mEmail = email;
        mWebsite = website;
        mImageResource = imageResource;
        mSource = source;
    }

    // Constructor with Event Date
    public LocationInformation(String title, String address, String description, String phoneNumber,
                               String email, String website, int imageResource, String source, String date) {
        mTitle = title;
        mAddress = address;
        mDescription = description;
        mPhoneNumber = phoneNumber;
        mEmail = email;
        mWebsite = website;
        mImageResource = imageResource;
        mSource = source;
        mDate = date;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAddress() {
        return mAddress;
    }

    public String getPhoneNumber() {
        return mPhoneNumber;
    }

    public String getEmail() {
        return mEmail;
    }

    public String getWebsite() {
        return mWebsite;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImageResource() {
        return mImageResource;
    }

    public String getDate() {
        return mDate;
    }

    public String getSource() {
        return mSource;
    }

}
