package com.example.ankaragezirehberi;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.ankaragezirehberi.databinding.ActivityMaps4Binding;

public class Maps4 extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMaps4Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMaps4Binding.inflate(getLayoutInflater());
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

        LatLng eymir = new LatLng(39.8273151,32.8302243);
        mMap.addMarker(new MarkerOptions().position(eymir).title("Eymir Gölü"));

        LatLng genclik = new LatLng(39.9367421,32.8499392);
        mMap.addMarker(new MarkerOptions().position(genclik).title("Gençlik Parkı"));

        LatLng goksu = new LatLng(39.9905765,32.6473734);
        mMap.addMarker(new MarkerOptions().position(goksu).title("Göksu Parkı"));

        LatLng anfa = new LatLng(39.9674991,32.8753296);
        mMap.addMarker(new MarkerOptions().position(anfa).title("Anfa Altınpark"));

        LatLng segmenler = new LatLng(39.8948263,32.8628753);
        mMap.addMarker(new MarkerOptions().position(segmenler).title("Seğmenler Parkı"));

        LatLng mogan = new LatLng(39.7784779,32.786139);
        mMap.addMarker(new MarkerOptions().position(mogan).title("Mogan Gölü"));

        LatLng ahlatlibel = new LatLng(39.8431012,32.7918063);
        mMap.addMarker(new MarkerOptions().position(ahlatlibel).title("Ahlatlıbel Tesisleri Parkı"));

        LatLng kugulu = new LatLng(39.9020058,32.8601204);
        mMap.addMarker(new MarkerOptions().position(kugulu).title("Kuğulu Park"));

        LatLng yill = new LatLng(39.9235388,32.8761104);
        mMap.addMarker(new MarkerOptions().position(yill).title("50. Yıl Parkı"));

        LatLng aoc = new LatLng(39.9478567,32.8071289);
        mMap.addMarker(new MarkerOptions().position(aoc).title("Atatürk Orman Çifliği"));

        LatLng harikalar = new LatLng(39.9835409,32.5912993);
        mMap.addMarker(new MarkerOptions().position(yill).title("Harikalar Diyarı"));

        LatLng kurtulus = new LatLng(39.9266849,32.8633342);
        mMap.addMarker(new MarkerOptions().position(kurtulus).title("Kurtuluş Parkı"));

    }
}