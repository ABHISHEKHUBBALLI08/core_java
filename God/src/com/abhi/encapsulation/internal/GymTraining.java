package com.abhi.encapsulation.internal;

public class GymTraining {
    public void trainingDetails() {
        System.out.println(" gym provides various training programs");
        Gym gym = new Gym();
        gym.setGymId(1102);
        gym.setName("MuscleZone");
        gym.setLocation("Keshwapur, Hubli");
        gym.setTrainer("Akshay Patil");
        gym.setTimings("5 AM - 9 PM");
        gym.getGymId();
        gym.getName();
        gym.getLocation();
        gym.getTrainer();
        gym.getTimings();
    }
}
