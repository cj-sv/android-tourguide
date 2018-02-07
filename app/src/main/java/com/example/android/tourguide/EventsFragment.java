package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class EventsFragment extends Fragment {


    public EventsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<LocationInformation> info = new ArrayList<>();
        info.add(new LocationInformation("Panagbenga Festival",
                "Baguio City, Philippines",
                "Panagbenga Festival (English: Flower Festival) is a month-long annual flower festival occurring in Baguio. The term is of Kankanaey origin, meaning \"season of blooming\". The festival, held during the month of February, was created as a tribute to the city's flowers and as a way to rise up from the devastation of the 1990 Luzon earthquake.",
                "N/A",
                "N/A",
                "panagbengafestival.com",
                R.drawable.panagbenga,
                "Wikipedia, Maharlika News",
                "February to First Week of March"));

        info.add(new LocationInformation("Christmas Village",
                "Baguio City, Philippines",
                "Visiting the Baguio Country Club's Christmas Village is always is a worthwhile experience for the young and old. The village features various characters from popular children’s books, and a Nativity re-enactment sets the village's tone in the evenings, reminding everyone of a more Christ-centered celebration.\n" +
                        "\n" +
                        "Meanwhile, the lights, artificial snow show, and Christmas carolers at the main stage never cease to amaze the crowd. ",
                "N/A",
                "N/A",
                "N/A",
                R.drawable.xmasvillage,
                "Rappler",
                "Last week of November to end of December"));

        LocationInformationAdapter adapter = new LocationInformationAdapter(getActivity(), info);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        return listView;
    }

}
