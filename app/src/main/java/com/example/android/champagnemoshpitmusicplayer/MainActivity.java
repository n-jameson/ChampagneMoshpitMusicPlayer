package com.example.android.champagnemoshpitmusicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView enter = (ImageView) findViewById(R.id.enter_image);

        enter.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent songListIntent = new Intent(MainActivity.this, SongList.class);


                startActivity(songListIntent);
            }
        });

    }
}
