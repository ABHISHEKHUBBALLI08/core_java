package com.abhi.features.runner;

import com.abhi.features.internal.Thunderbolts;

public class ThunderboltsRunner2 {
    public static void main(String[] args) {
        Thunderbolts agent = new Thunderbolts() {
            public void executeMission() {
                System.out.println("new Agent: Executing mission.");
            }

            public void neutralizeTarget() {
                System.out.println("new Agent: Target neutralized.");
            }

            public void gatherIntel() {
                System.out.println("new Agent: Gathering intel.");
            }

            public void deployStealth() {
                System.out.println("new Agent: Deploying stealth.");
            }

            public void escape() {
                System.out.println("new Agent: Escaping area.");
            }

            public void sabotage() {
                System.out.println("new Agent: Sabotaging plans.");
            }

            public void defend() {
                System.out.println("new Agent: Providing defense.");
            }

            public void confrontEnemy() {
                System.out.println("new Agent: Engaging enemy.");
            }

            public void hackSystems() {
                System.out.println("new Agent: Hacking systems.");
            }

            public void deliverPayload() {
                System.out.println("new Agent: Delivering payload.");
            }
        };

        // Invoke abstract methods
        agent.executeMission();
        agent.neutralizeTarget();
        agent.gatherIntel();
        agent.deployStealth();
        agent.escape();
        agent.sabotage();
        agent.defend();
        agent.confrontEnemy();
        agent.hackSystems();
        agent.deliverPayload();

        // Invoke default methods
        agent.reportStatus();
        agent.regroup();
        agent.concealIdentity();
        agent.upgradeGear();
        agent.suppressThreat();
        agent.interrogateEnemy();
        agent.syncWithTeam();
        agent.scanArea();
        agent.setupTrap();
        agent.collectEvidence();

        // Invoke static methods
        Thunderbolts.thunderboltEntry();
        Thunderbolts.deployStrikeTeam();
        Thunderbolts.initiateBlackOps();
        Thunderbolts.disableComms();
        Thunderbolts.backupRequired();
        Thunderbolts.loadIntel();
        Thunderbolts.missionComplete();
        Thunderbolts.abortMission();
        Thunderbolts.overrideSystem();
        Thunderbolts.shutdownProtocol();
    }
}
