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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_view, container, false);

        final ArrayList<LocationInformation> info = new ArrayList<>();
        info.add(new LocationInformation("Burnham Park",
                "Burnham, Baguio City",
                "Burnham Park, officially known as the Burnham Park Reservation, is a historic urban park located in downtown Baguio, Philippines. It was designed by American architect and Baguio city planner, Daniel Burnham who is also the namesake of the park.",
                "N/A",
                "N/A",
                "N/A",
                R.drawable.burnham,
                "Wikipedia"));
        info.add(new LocationInformation("Mines View Park",
                "Mines View, Baguio City",
                "Mines View Park is an overlook park on the northeastern outskirts of Baguio in the Philippines.\n" +
                        "\n" +
                        "Located on a land promontory 4 km from downtown Baguio, the park overlooks the mining town of Itogon, particularly the abandoned gold and copper mines of the Benguet Corporation, and offers a glimpse of the Amburayan Valley.\n" +
                        "\n" +
                        "The observation deck is situated below a winding stone-covered stairway close to the parking area.",
                "N/A",
                "N/A",
                "N/A",
                R.drawable.minesview,
                "Wikipedia"));




        LocationInformationAdapter adapter = new LocationInformationAdapter(getActivity(), info);
        ListView listView = (ListView) rootView.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        return listView;
    }

}
