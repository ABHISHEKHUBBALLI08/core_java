package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.MusicPlayer;

public class SpotifyPlayer implements MusicPlayer {

    @Override
    public void play() {
        System.out.println("Playing music on Spotify");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music on Spotify");
    }

    @Override
    public void next() {
        System.out.println("Skipping to next track on Spotify");
    }
}
