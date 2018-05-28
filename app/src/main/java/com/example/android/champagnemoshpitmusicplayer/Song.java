package com.example.android.champagnemoshpitmusicplayer;

import android.media.Image;
import android.widget.ImageView;

public class Song {
    private Integer msongArt;
    private String msongTitle;
    private String msongArtist;

    public Song(Integer songArt, String songTitle, String songArtist) {
        msongArt = songArt;
        msongTitle = songTitle;
        msongArtist = songArtist;

    }

    public Integer getmSongArt() {
        return msongArt;
    }
    public String getmsongTitle() {return msongTitle;}
    public String getmsongArtist() {return msongArtist;}

}
