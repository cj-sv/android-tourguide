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
public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<LocationInformation> info = new ArrayList<>();
        info.add(new LocationInformation("SM City Baguio",
                "Luneta Hill, Upper Session Road, Baguio City",
                "SM City Baguio is an enclosed shopping mall in Baguio in the Philippines. At a floor area of 107,841 m2 (1,160,790 sq ft), it is the largest shopping mall in the whole North Luzon Region. The entire complex stands on a land area of 80,000 m2 (860,000 sq ft) on Luneta Hill on top of Session Road overlooking historic Burnham Park and opposite Baguio's City Hall which is situated on a northern hill.\n" +
                        "\n" +
                        "The mall was formally opened on November 21, 2003. It is also the first SM Supermall which does not use an air-conditioning system upon its completion. The mall is the only SM Mall, other than the SM Mall of Asia, that make use of natural lighting and which does not have an air conditioned common area.\n" +
                        "\n" +
                        "The site of the mall was once occupied by the Pines Hotel, which burned down.",
                "(+6374) 6197838 - 42",
                "N/A",
                "smsupermalls.com/mall-locator/sm-city-baguio/information",
                R.drawable.sm,
                "Wikipedia"));

        LocationInformationAdapter adapter = new LocationInformationAdapter(getActivity(), info);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        return listView;
    }

}
