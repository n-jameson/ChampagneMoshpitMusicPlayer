package com.example.android.champagnemoshpitmusicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CurrentSongAdapter extends ArrayAdapter<Song> {

    public CurrentSongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);


        ImageView songArt = (ImageView) listItemView.findViewById(R.id.current_song_art);

        songArt.setImageResource(currentSong.getmSongArt());


        TextView songTitle = (TextView) listItemView.findViewById(R.id.current_song_title);

        songTitle.setText(currentSong.getmsongTitle());


        TextView songArtist = (TextView) listItemView.findViewById(R.id.current_song_artist);

        songArtist.setText(currentSong.getmsongArtist());

        return listItemView;
    }
}
