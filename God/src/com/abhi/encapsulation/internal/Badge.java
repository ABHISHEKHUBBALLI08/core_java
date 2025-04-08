package com.abhi.encapsulation.internal;

public class Badge {
    private int badgeId = 301;
    private String badgeName = "Elite";
    private String level = "Gold";
    private String issuer = "Academy";
    private String validity = "2025";

    void setBadgeId(int badgeId) {
        this.badgeId = badgeId;
    }

    void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }

    void setLevel(String level) {
        this.level = level;
    }

    void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    void setValidity(String validity) {
        this.validity = validity;
    }

    public void getBadgeId() {
        System.out.println(badgeId);
    }

    public void getBadgeName() {
        System.out.println(badgeName);
    }

    public void getLevel() {
        System.out.println(level);
    }

    public void getIssuer() {
        System.out.println(issuer);
    }

    public void getValidity() {
        System.out.println(validity);
    }
}
