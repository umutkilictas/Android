package com.example.ankaragezirehberi;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.ankaragezirehberi.databinding.ActivityMapsBinding;

public class Maps extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
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

        LatLng forumankara = new LatLng(40.0171204,32.8209551);
        mMap.addMarker(new MarkerOptions().position(forumankara).title("Forum Ankara"));

        LatLng natavega = new LatLng(39.8873596,32.9319452);
        mMap.addMarker(new MarkerOptions().position(natavega).title("NataVega"));

        LatLng armada = new LatLng(39.912703,32.806827);
        mMap.addMarker(new MarkerOptions().position(armada).title("Armada"));

        LatLng ankamall = new LatLng(39.9504171,32.8290891);
        mMap.addMarker(new MarkerOptions().position(ankamall).title("Ankamall"));


    }

}