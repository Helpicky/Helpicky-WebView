package org.twbbs.helpicky.helpicky_webview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String myURL = "http://helpicky.twbbs.org/";
        WebView myBrowser=(WebView)findViewById(R.id.webview);

        WebSettings websettings = myBrowser.getSettings();
        websettings.setSupportZoom(false);
        websettings.setBuiltInZoomControls(false);
        websettings.setJavaScriptEnabled(true);

        myBrowser.setWebViewClient(new WebViewClient());

        myBrowser.loadUrl(myURL);
    }
}
