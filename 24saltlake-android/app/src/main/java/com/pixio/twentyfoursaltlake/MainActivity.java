package com.pixio.twentyfoursaltlake;

import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {

    private WebView _webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        _webView = new WebView(this);
        _webView.setId(10);

        getWindow().requestFeature(android.view.Window.FEATURE_PROGRESS);

        _webView.getSettings().setJavaScriptEnabled(true);

        _webView.setWebViewClient(new WebViewClient());

        _webView.loadUrl("http://www.24saltlake.com/");

        setContentView(_webView);
    }

    @Override
    protected  void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        _webView.saveState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);

        _webView.restoreState(savedInstanceState);

    }

}
