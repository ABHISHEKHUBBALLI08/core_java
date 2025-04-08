package com.abhi.encapsulation.internal;

public class BadgeDetails {
    public void displayDetails() {
        System.out.println(" badge represents achievement level");
        Badge badge = new Badge();
        badge.setBadgeId(302);
        badge.setBadgeName("Champion");
        badge.setLevel("Platinum");
        badge.setIssuer("Gaming League");
        badge.setValidity("2025");
        badge.getBadgeId();
        badge.getBadgeName();
        badge.getLevel();
        badge.getIssuer();
        badge.getValidity();
    }
}
