package com.abhi.features.internal;

public interface Thunderbolts {

    // 10 Abstract Methods
    void executeMission();
    void neutralizeTarget();
    void gatherIntel();
    void deployStealth();
    void escape();
    void sabotage();
    void defend();
    void confrontEnemy();
    void hackSystems();
    void deliverPayload();

    // 10 Default Methods
    default void reportStatus() {
        System.out.println("Status reported to command.");
    }

    default void regroup() {
        System.out.println("Regrouping at safe point.");
    }

    default void concealIdentity() {
        System.out.println("Identity concealed.");
    }

    default void upgradeGear() {
        System.out.println("Upgrading gear for the next mission.");
    }

    default void suppressThreat() {
        System.out.println("Suppressing hostile forces.");
    }

    default void interrogateEnemy() {
        System.out.println("Interrogating captured enemy.");
    }

    default void syncWithTeam() {
        System.out.println("Syncing communication with team.");
    }

    default void scanArea() {
        System.out.println("Scanning the surrounding area.");
    }

    default void setupTrap() {
        System.out.println("Setting up a trap.");
    }

    default void collectEvidence() {
        System.out.println("Collecting mission evidence.");
    }

    // 10 Static Methods
    static void thunderboltEntry() {
        System.out.println("Thunderbolts have entered the field.");
    }

    static void deployStrikeTeam() {
        System.out.println("Strike team deployed.");
    }

    static void initiateBlackOps() {
        System.out.println("Black Ops mission initiated.");
    }

    static void disableComms() {
        System.out.println("Enemy communications disabled.");
    }

    static void backupRequired() {
        System.out.println("Backup requested.");
    }

    static void loadIntel() {
        System.out.println("Intel loading from server.");
    }

    static void missionComplete() {
        System.out.println("Mission successfully completed.");
    }

    static void abortMission() {
        System.out.println("Mission aborted.");
    }

    static void overrideSystem() {
        System.out.println("Overriding enemy system.");
    }

    static void shutdownProtocol() {
        System.out.println("Executing shutdown protocol.");
    }
}
