package com.example.resultbd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private AdView mAdView;
   private Button BtnSSC;
   private Button BtnNu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
//        List<String> testDeviceIds = Arrays.asList("FEEC8A46B8E4AB3E6D099CF49467D167");
//        RequestConfiguration configuration =
//                new RequestConfiguration.Builder().setTestDeviceIds(testDeviceIds).build();
//        MobileAds.setRequestConfiguration(configuration);


        BtnSSC =  findViewById(R.id.ssc);
        BtnNu =  findViewById(R.id.nu);
        BtnNu.setOnClickListener(this);
        BtnSSC.setOnClickListener(this);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-3705458543007730/3226260225");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mAdView.setAdListener(new AdListener() {
                @Override
                public void onAdLoaded() {
                    super.onAdLoaded();
                    mAdView.setVisibility(View.VISIBLE);// Code to be executed when an ad finishes loading.
                }


            });
    }


    @Override
    public void onClick(View v) {
        if (v == BtnSSC) {
            startActivity(new Intent(MainActivity.this, sscweb.class));

        } else if (v == BtnNu) {
            startActivity(new Intent(MainActivity.this, nuweb.class));
        }
    }


}
