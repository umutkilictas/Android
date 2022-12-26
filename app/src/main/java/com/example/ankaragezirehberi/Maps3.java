package com.example.ankaragezirehberi;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.ankaragezirehberi.databinding.ActivityMaps3Binding;

public class Maps3 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMaps3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMaps3Binding.inflate(getLayoutInflater());
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

        LatLng anitkabir = new LatLng(39.9249956,32.8368353);
        mMap.addMarker(new MarkerOptions().position(anitkabir).title("Anıtkabir"));

        LatLng anadolu = new LatLng(39.9381974,32.8618322);
        mMap.addMarker(new MarkerOptions().position(anadolu).title("Anadolu Medeniyetler Müzesi"));

        LatLng rahmi = new LatLng(39.9372333,32.8633815);
        mMap.addMarker(new MarkerOptions().position(rahmi).title("Rahmi Koç Müzesi"));

        LatLng kurtulus = new LatLng(39.9419747,32.853456);
        mMap.addMarker(new MarkerOptions().position(kurtulus).title("Kurtuluş Savaşı Müzesi"));

        LatLng ulucanlar = new LatLng(39.9375926,32.8729807);
        mMap.addMarker(new MarkerOptions().position(ulucanlar).title("Ulucanlar Cezaevi Müzesi"));

        LatLng mta = new LatLng(39.9023959,32.798545);
        mMap.addMarker(new MarkerOptions().position(mta).title("MTA Şehit Cuma Dağ Müzesi"));

        LatLng altinkoy = new LatLng(39.9728485,32.9553346);
        mMap.addMarker(new MarkerOptions().position(altinkoy).title("Altınköy Açık Hava Müzesi"));

        LatLng cumhuriyet = new LatLng(39.9412032,32.851714);
        mMap.addMarker(new MarkerOptions().position(cumhuriyet).title("Cumhuriyet Müzesi"));

        LatLng erimtan = new LatLng(39.9378367,32.8629402);
        mMap.addMarker(new MarkerOptions().position(erimtan).title("Erimtan Arkeoloji ve Sanat Müzesi"));

        LatLng etnografyta = new LatLng(39.9326474,32.8553259);
        mMap.addMarker(new MarkerOptions().position(etnografyta).title("Etnografya Müzesi"));
    }
}