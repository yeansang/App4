package com.test.ysahn.app4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    private WebView mWebview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);

        mWebview = (WebView) findViewById(R.id.webview);

        mWebview.setWebViewClient(new WebViewClient());
        mWebview.loadUrl("http://m.daum.net");

    }
}
