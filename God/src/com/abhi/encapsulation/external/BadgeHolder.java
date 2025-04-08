package com.abhi.encapsulation.external;

import com.abhi.encapsulation.internal.Badge;

public class BadgeHolder {
    public void holderInfo() {
        System.out.println(" badge holder is a skilled individual");
        Badge badge = new Badge();
        badge.getBadgeId();
        badge.getBadgeName();
        badge.getLevel();
        badge.getIssuer();
        badge.getValidity();
    }
}
