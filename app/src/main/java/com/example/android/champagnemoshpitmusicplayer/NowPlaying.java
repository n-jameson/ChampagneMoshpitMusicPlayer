package com.example.android.champagnemoshpitmusicplayer;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class NowPlaying extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.now_playing);

        final String songName = getIntent().getStringExtra("song_name");
        final String songArtist = getIntent().getStringExtra("song_artist");
        final Integer songArt = getIntent().getIntExtra("song_art", 0);


        ImageView currentSongArt = (ImageView) findViewById(R.id.current_song_art);
        currentSongArt.setImageResource(songArt);

        TextView currentSongTitle = (TextView) findViewById(R.id.current_song_title);
        currentSongTitle.setText(songName);

        TextView currentSongArtist = (TextView) findViewById(R.id.current_song_artist);
        currentSongArtist.setText(songArtist);

        Button back = (Button) findViewById(R.id.back_to_song_list);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent songListIntent = new Intent(NowPlaying.this, SongList.class);


                startActivity(songListIntent);
            }
        });


    }
}
