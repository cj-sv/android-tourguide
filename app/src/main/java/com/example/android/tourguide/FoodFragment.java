package com.example.android.tourguide;


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
public class FoodFragment extends Fragment {


    public FoodFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<LocationInformation> info = new ArrayList<>();
        info.add(new LocationInformation("Good Taste Restaurant",
                "Corner Cariño Street & Otek Street, Baguio City",
                "Filipino and Chinese Food",
                "0912 795 8514",
                "N/A",
                "web.facebook.com/pages/Good-Taste-Cafe-Restaurant",
                R.drawable.goodtaste,
                "Facebook"));
        info.add(new LocationInformation("Sage",
                "95 Military Cut-off Road, Baguio City",
                "Bar and Grill, Coffee Shop",
                "(074) 422 2954",
                "N/A",
                "web.facebook.com/sagebaguio",
                R.drawable.sage,
                "Facebook"));

        LocationInformationAdapter adapter = new LocationInformationAdapter(getActivity(), info);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        return listView;
    }

}
