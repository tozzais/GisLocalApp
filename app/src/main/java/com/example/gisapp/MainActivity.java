package com.example.gisapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.esri.arcgisruntime.layers.OpenStreetMapLayer;
import com.esri.arcgisruntime.mapping.ArcGISMap;
import com.esri.arcgisruntime.mapping.Basemap;
import com.esri.arcgisruntime.mapping.view.MapView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MapView mapView = findViewById(R.id.mapView);
        OpenStreetMapLayer openStreetMapLayer = new OpenStreetMapLayer();
        Basemap basemap = new Basemap(openStreetMapLayer);
        ArcGISMap arcGISMap = new ArcGISMap();
        arcGISMap.setBasemap(basemap);
        mapView.setMap(arcGISMap);
    }
}