package com.example.ankaragezirehberi;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.ankaragezirehberi.databinding.ActivityMaps2Binding;

public class Maps2 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMaps2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMaps2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {

        mMap = googleMap;
        LatLng ankara = new LatLng(39.9251191,32.8383133);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(ankara,11));

        LatLng hamamonu = new LatLng(39.9333225,32.8633826);
        mMap.addMarker(new MarkerOptions().position(hamamonu).title("Hamamönü"));

        LatLng milletbahcesi = new LatLng(39.9446144,32.8354053);
        mMap.addMarker(new MarkerOptions().position(milletbahcesi).title("Millet Bahçesi"));

        LatLng teleferik = new LatLng(39.9614743,32.8037145);
        mMap.addMarker(new MarkerOptions().position(teleferik).title("Teleferik"));


    }
}