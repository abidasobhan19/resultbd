package com.example.resultbd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class sscweb extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sscweb);


        webView = findViewById(R.id.webview);


//            webView = (WebView) findViewById (R.id.wed);
        webView.loadUrl ("https://eboardresults.com/app/stud/");

        WebSettings webSettings = webView.getSettings ( );
        webView.getSettings ().setJavaScriptEnabled (true);
        webView.getSettings ().setAppCacheEnabled (true);
        webView.getSettings ().setDatabaseEnabled (true);
        webView.getSettings ().setDomStorageEnabled (true);
        webView.getSettings ().setJavaScriptCanOpenWindowsAutomatically (true);
//        webView.getSettings ().setBuiltInZoomControls (true);

        webView.getSettings ().setGeolocationEnabled (true);
        webView.setWebViewClient (new WebViewClient());

//            webView.getSettings ().getAllowFileAccess ();
//            webView.getSettings ().setAllowContentAccess (true);
        webSettings.setJavaScriptEnabled (true);
//            webSettings.setLoadsImagesAutomatically (true);

//        webSettings.getAllowContentAccess();
//        webSettings.getAllowFileAccess();
//        webSettings.getDisplayZoomControls();
//        webSettings.getJavaScriptCanOpenWindowsAutomatically();
//        webSettings.getBlockNetworkImage();
    }
}
