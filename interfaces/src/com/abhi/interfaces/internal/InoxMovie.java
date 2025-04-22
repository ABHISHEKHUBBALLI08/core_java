package com.abhi.interfaces.internal;

import com.abhi.interfaces.rules.Movie;

public class InoxMovie implements Movie {

    @Override
    public void watch() {
        System.out.println("Watching movie in INOX");
    }

    @Override
    public void pause() {
        System.out.println("Pausing movie in INOX");
    }

    @Override
    public void rate() {
        System.out.println("Rating the movie in INOX");
    }
}
