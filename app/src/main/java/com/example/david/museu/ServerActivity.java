package com.example.david.museu;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.webkit.WebView;


public class ServerActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_server);
        WebView wv = (WebView) findViewById(R.id.webView);
        wv.loadUrl("http://www.google.es");
    }
}
