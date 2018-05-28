package com.example.android.champagnemoshpitmusicplayer;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;


public class SongList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songlist_layout);

        ListView songSelected = (ListView) findViewById(R.id.songList);

        songSelected.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent nowPlayingIntent = new Intent(SongList.this, NowPlaying.class);




                startActivity(nowPlayingIntent);

            }
        });

        ArrayList<Song> songs = new ArrayList<Song>();



        songs.add(new Song(R.drawable.bucket, "Buckets", "Wallbangers"));
        songs.add(new Song(R.drawable.sneeze, "Sneeze On 'Em", "Wallbangers"));
        songs.add(new Song(R.drawable.waterfall, "Feel Me", "Wallbangers ft. Adanna Duru"));
        songs.add(new Song(R.drawable.pig, "Pigs Feet", "Wallbangers"));
        songs.add(new Song(R.drawable.bankrobbery, "Donuts", "Wallbangers ft. Drevo"));

        SongAdapter adapter = new SongAdapter(this, songs);

        ListView listView = (ListView) findViewById(R.id.songList);
        listView.setAdapter(adapter);






}
}
