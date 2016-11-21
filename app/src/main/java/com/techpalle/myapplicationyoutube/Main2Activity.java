package com.techpalle.myapplicationyoutube;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

 public class Main2Activity extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    String string1;
    YouTubePlayerView youTubeView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        youTubeView.initialize("AIzaSyBckj4mA5oE8_wTiYnKm7GGNgB68vwGr1o",this);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String string1 = bundle.getString("string1");
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {

      if (b = true){

          youTubePlayer.cueVideo("E_7LGsaxiFI");// Plays https://www.youtube.com/watch?v=E_7LGsaxiFI
      }

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

    }


}
