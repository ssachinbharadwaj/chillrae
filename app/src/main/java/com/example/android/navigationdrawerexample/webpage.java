package com.example.android.navigationdrawerexample;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.view.View;
import android.webkit.WebViewClient;
/**
 * Created by yadu on 16/01/15.
 */
public class webpage extends Activity {
    private WebView browser;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gatewaypage);
        browser = (WebView) findViewById(R.id.webview);
        browser.setWebViewClient(new MyBrowser());
        browser.getSettings().setLoadsImagesAutomatically(true);
        browser.getSettings().setJavaScriptEnabled(true);
        browser.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
        browser.loadUrl("http://www.opensalesme.com/dist");
    }

    private class MyBrowser extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }
}
