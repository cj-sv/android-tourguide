package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CityFragment extends Fragment {


    public CityFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<LocationInformation> info = new ArrayList<>();
        info.add(new LocationInformation("Baguio City",
                "Benguet, Philippines",
                "Baguio, officially the City of Baguio (Ibaloi: Ciudad ne Bagiw; Ilokano: Siudad ti Baguio; Filipino: Lungsod ng Baguio) and popularly referred to as Baguio City, is a mountain resort city located in Northern Luzon, Philippines. It is known as the Summer Capital of the Philippines, owing to its cool climate since the city is located approximately 1,540 meters (5,050 feet) above sea level in the Luzon tropical pine forests ecoregion, which also makes it conducive for the growth of mossy plants and orchids.",
                "(6374) 300 6500",
                "baguio.webmin@gmail.com",
                "baguio.gov.ph",
                R.drawable.mountains,
                "Wikipedia"));

        LocationInformationAdapter adapter = new LocationInformationAdapter(getActivity(), info);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        return listView;
    }

}
