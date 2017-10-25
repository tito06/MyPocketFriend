package com.abc.prabalkar.mypocketfriend;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textview;

    Button button, button2;

    WebView webview;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview = (TextView) findViewById(R.id.textview);

        button =(Button) findViewById(R.id.button);

        button2 = (Button) findViewById(R.id.button2);

        webview = (WebView) findViewById(R.id.webview);
        webview.setWebViewClient(new MyBrowser());
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                WebView browser = (WebView) findViewById(R.id.webview);
                browser.loadUrl("heltered-garden-87341.herokuapp.com/categories");

            }
        });https://s

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                WebView browser = (WebView) findViewById(R.id.webview);
                browser.loadUrl("https://damp-ravine-62247.herokuapp.com/branches");

            }
        });
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

}
