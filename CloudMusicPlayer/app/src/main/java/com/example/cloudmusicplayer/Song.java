package com.example.cloudmusicplayer;

public class Song {
    private String songName,SongUrl;
    public Song()
    {

    }
    public Song(String songName, String songUrl) {
        this.songName = songName;
        SongUrl = songUrl;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSongUrl() {
        return SongUrl;
    }

    public void setSongUrl(String songUrl) {
        SongUrl = songUrl;
    }
}
