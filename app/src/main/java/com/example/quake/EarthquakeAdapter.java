package com.example.quake;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes){
        super(context,0,earthquakes);
    }
    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Earthquake currentEarthquake = getItem(position);

        TextView magnitude = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitude.setText(currentEarthquake.getMagnitude());

        TextView city = (TextView) listItemView.findViewById(R.id.city);
        city.setText(currentEarthquake.getCity());

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(currentEarthquake.getDate());

        return listItemView;
    }

}
