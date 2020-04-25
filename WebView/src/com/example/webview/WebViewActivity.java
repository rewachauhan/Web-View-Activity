package com.example.webview;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewActivity extends Activity {
	WebView webView1;
    @SuppressLint("NewApi") @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        getActionBar().hide();
        webView1=(WebView) findViewById(R.id.webView1);
        webView1.setWebViewClient(new WebViewClient());
        webView1.loadUrl("http://www.google.com");
       }

    
    @Override
	public void onBackPressed() {
    	if(webView1.canGoBack())
    		webView1.goBack();
    	else
    		super.onBackPressed();
	}


	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.web_view, menu);
        return true;
    }
    
}
