package com.example.android.champagnemoshpitmusicplayer;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        ImageView songArt = (ImageView) listItemView.findViewById(R.id.album_art);
        // Get the songArt from the current SongList object and
        // set this image on the album_art ImageView
        songArt.setImageResource(currentSong.getmSongArt());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songTitle = (TextView) listItemView.findViewById(R.id.song_name);
        // Get the songTitle from the current songList object and
        // set this text on the song_name TextView
        songTitle.setText(currentSong.getmsongTitle());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songArtist = (TextView) listItemView.findViewById(R.id.artist_name);
        // Get the songArtist from the current songList object and
        // set this text on the artist_name TextView
        songArtist.setText(currentSong.getmsongArtist());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
