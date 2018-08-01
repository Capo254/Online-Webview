package com.example.emobilis.onlinewebview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.web);
        Uri uri = Uri.parse("https://tripadvisor.com");
        Intent viewit = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(viewit);
    }
}
