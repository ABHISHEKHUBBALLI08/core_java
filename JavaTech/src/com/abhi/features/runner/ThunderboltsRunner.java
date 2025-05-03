package com.abhi.features.runner;

import com.abhi.features.internal.RedGuardian;
import com.abhi.features.internal.Thunderbolts;

public class ThunderboltsRunner {
    public static void main(String[] args) {
        Thunderbolts agent = new RedGuardian();

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
