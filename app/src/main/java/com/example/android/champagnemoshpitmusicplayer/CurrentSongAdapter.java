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
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Song currentSong = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        ImageView songArt = (ImageView) listItemView.findViewById(R.id.current_song_art);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        songArt.setImageResource(currentSong.getmSongArt());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songTitle = (TextView) listItemView.findViewById(R.id.current_song_title);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        songTitle.setText(currentSong.getmsongTitle());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView songArtist = (TextView) listItemView.findViewById(R.id.current_song_artist);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        songArtist.setText(currentSong.getmsongArtist());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
