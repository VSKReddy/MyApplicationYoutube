package com.techpalle.myapplicationyoutube;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


public class MainActivity extends AppCompatActivity {

    WebView webview1;
    EditText editText1;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webview1 = (WebView) findViewById(R.id.webview1);
        editText1 = (EditText) findViewById(R.id.edittext1);
        button1 = (Button) findViewById(R.id.button1);

        webview1.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {


                String string1 = editText1.getText().toString();
                String link = "http://m.youtube.com/results?q= "+string1;
                webview1.getSettings().setJavaScriptEnabled(true);
                webview1.setWebViewClient(new WebViewClient());
                return true;

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( MainActivity.this,Main2Activity.class);
                intent.putExtra("url",editText1.getText().toString());
                startActivity(intent);


            }
        });
    }

}
