package com.example.quake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {
    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("7","San Francisco","Feb 2,2016"));
        earthquakes.add(new Earthquake("6","London","Feb 2,2016"));
        earthquakes.add(new Earthquake("3","Tokyo","Feb 2,2016"));
        earthquakes.add(new Earthquake("4","Mexico City","Feb 2,2016"));
        earthquakes.add(new Earthquake("8","Moscow","Feb 2,2016"));
        earthquakes.add(new Earthquake("4","Rio de Janeiro","Feb 2,2016"));
        earthquakes.add(new Earthquake("6","Paris","Feb 2,2016"));


        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter adapter = new EarthquakeAdapter(this,earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        earthquakeListView.setAdapter(adapter);
    }
}
