package com.abhi.encapsulation.internal;

public class Gym {
    private int gymId = 1101;
    private String name = "HubliFitness";
    private String location = "Hubli";
    private String trainer = "Rohit Shetty";
    private String timings = "6 AM - 10 PM";

    void setGymId(int gymId) {
        this.gymId = gymId;
    }

    void setName(String name) {
        this.name = name;
    }

    void setLocation(String location) {
        this.location = location;
    }

    void setTrainer(String trainer) {
        this.trainer = trainer;
    }

    void setTimings(String timings) {
        this.timings = timings;
    }

    public void getGymId() {
        System.out.println(gymId);
    }

    public void getName() {
        System.out.println(name);
    }

    public void getLocation() {
        System.out.println(location);
    }

    public void getTrainer() {
        System.out.println(trainer);
    }

    public void getTimings() {
        System.out.println(timings);
    }
}
