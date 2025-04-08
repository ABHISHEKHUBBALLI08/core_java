package com.abhi.encapsulation.external;

import com.abhi.encapsulation.internal.Gym;

public class GymMembership {
    public void membershipDetails() {
        System.out.println(" gym offers monthly and annual memberships");
        Gym gym = new Gym();
        gym.getGymId();
        gym.getName();
        gym.getLocation();
        gym.getTrainer();
        gym.getTimings();
    }
}
