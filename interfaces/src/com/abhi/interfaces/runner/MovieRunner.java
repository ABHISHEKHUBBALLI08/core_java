package com.abhi.interfaces.runner;

import com.abhi.interfaces.internal.*;
import com.abhi.interfaces.rules.*;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie = new InoxMovie();
        movie.watch();
        movie.pause();
        movie.rate();
        InoxMovie inox = new InoxMovie();
        inox.watch();
        inox.pause();
        inox.rate();
        System.out.println("======================================");

        MusicPlayer player = new SpotifyPlayer();
        player.play();
        player.pause();
        player.next();
        SpotifyPlayer spotify = new SpotifyPlayer();
        spotify.play();
        spotify.pause();
        spotify.next();
        System.out.println("======================================");

        GameConsole console = new XboxConsole();
        console.start();
        console.pause();
        console.save();
        XboxConsole xbox = new XboxConsole();
        xbox.start();
        xbox.pause();
        xbox.save();
        System.out.println("======================================");

        ThemeParkRide ride = new RollerCoaster();
        ride.start();
        ride.stop();
        ride.maintenanceCheck();
        RollerCoaster coaster = new RollerCoaster();
        coaster.start();
        coaster.stop();
        coaster.maintenanceCheck();
        System.out.println("======================================");

        StreamingPlatform platform = new NetflixPlatform();
        platform.play();
        platform.pause();
        platform.browse();
        NetflixPlatform netflix = new NetflixPlatform();
        netflix.play();
        netflix.pause();
        netflix.browse();
        System.out.println("======================================");


    }
}
