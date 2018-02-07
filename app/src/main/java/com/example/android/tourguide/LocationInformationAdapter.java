package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by carlo on 1/12/18.
 */

public class LocationInformationAdapter extends ArrayAdapter<LocationInformation> {

    public LocationInformationAdapter(Activity context, ArrayList<LocationInformation> info) {
        super(context, 0, info);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_information,
                    parent, false);
        }

        final LocationInformation currentInfo = getItem(position);

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentInfo.getImageResource());

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentInfo.getTitle());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.address);
        addressTextView.setText(currentInfo.getAddress());

        TextView websiteTextView = (TextView) listItemView.findViewById(R.id.website);
        websiteTextView.setText(currentInfo.getWebsite());

        TextView phoneTextView = (TextView) listItemView.findViewById(R.id.phone);
        phoneTextView.setText(currentInfo.getPhoneNumber());

        TextView emailTextView = (TextView) listItemView.findViewById(R.id.email);
        emailTextView.setText(currentInfo.getEmail());

        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentInfo.getDescription());

        TextView sourceTextView = (TextView) listItemView.findViewById(R.id.source);
        sourceTextView.append(currentInfo.getSource());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);

        if (currentInfo.getDate() != null) {
            dateTextView.setText(currentInfo.getDate());
            dateTextView.setCompoundDrawablesWithIntrinsicBounds(R.mipmap.ic_date_range_black_24dp, 0, 0, 0);
        } else {
            dateTextView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}
