package com.abhi.override1.external;

import com.abhi.override1.internal.*;

public class MarvelUniverse1 {

    public void captainAmerica(SuperSoldier soldier) {
        System.out.println("captainAmerica running in Marvel1");
        if (soldier != null) {
            soldier.usePower();
            if (soldier instanceof CaptainAmerica) {
                CaptainAmerica cap = (CaptainAmerica) soldier;
                cap.throwShield();
            } else {
                System.out.println("soldier is not CaptainAmerica");
            }
        } else {
            System.out.println("soldier is null");
        }
    }

    public void ironMan(ArmoredHero hero) {
        System.out.println("ironMan running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof IronMan) {
                IronMan iron = (IronMan) hero;
                iron.launchMissiles();
            } else {
                System.out.println("hero is not IronMan");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void thor(Asgardian god) {
        System.out.println("thor running in Marvel1");
        if (god != null) {
            god.usePower();
            if (god instanceof Thor) {
                Thor thor = (Thor) god;
                thor.callLightning();
            } else {
                System.out.println("god is not Thor");
            }
        } else {
            System.out.println("god is null");
        }
    }

    public void hulk(GeniusScientist scientist) {
        System.out.println("hulk running in Marvel1");
        if (scientist != null) {
            scientist.usePower();
            if (scientist instanceof Hulk) {
                Hulk hulk = (Hulk) scientist;
                hulk.smash();
            } else {
                System.out.println("scientist is not Hulk");
            }
        } else {
            System.out.println("scientist is null");
        }
    }

    public void doctorStrange(MysticMaster master) {
        System.out.println("doctorStrange running in Marvel1");
        if (master != null) {
            master.usePower();
            if (master instanceof DoctorStrange) {
                DoctorStrange doc = (DoctorStrange) master;
                doc.openPortal();
            } else {
                System.out.println("master is not DoctorStrange");
            }
        } else {
            System.out.println("master is null");
        }
    }

    public void blackWidow(StealthAgent agent) {
        System.out.println("blackWidow running in Marvel1");
        if (agent != null) {
            agent.usePower();
            if (agent instanceof BlackWidow) {
                BlackWidow widow = (BlackWidow) agent;
                widow.useSting();
            } else {
                System.out.println("agent is not BlackWidow");
            }
        } else {
            System.out.println("agent is null");
        }
    }

    public void hawkeye(Sharpshooter shooter) {
        System.out.println("hawkeye running in Marvel1");
        if (shooter != null) {
            shooter.usePower();
            if (shooter instanceof Hawkeye) {
                Hawkeye hawk = (Hawkeye) shooter;
                hawk.fireArrow();
            } else {
                System.out.println("shooter is not Hawkeye");
            }
        } else {
            System.out.println("shooter is null");
        }
    }

    public void blackPanther(WakandanHero hero) {
        System.out.println("blackPanther running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof BlackPanther) {
                BlackPanther panther = (BlackPanther) hero;
                panther.activateSuit();
            } else {
                System.out.println("hero is not BlackPanther");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void spiderMan(SpiderHero hero) {
        System.out.println("spiderMan running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof SpiderMan) {
                SpiderMan spidey = (SpiderMan) hero;
                spidey.webShoot();
            } else {
                System.out.println("hero is not SpiderMan");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void antMan(ShrinkHero hero) {
        System.out.println("antMan running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof AntMan) {
                AntMan ant = (AntMan) hero;
                ant.rideAnt();
            } else {
                System.out.println("hero is not AntMan");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void captainAmerica1(ShieldHero hero) {
        System.out.println("captainAmerica1 running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof CaptainAmerica1) {
                CaptainAmerica1 cap = (CaptainAmerica1) hero;
                cap.throwShield();
            } else {
                System.out.println("hero is not CaptainAmerica1");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void vision(AndroidAvenger hero) {
        System.out.println("vision running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Vision) {
                Vision vision = (Vision) hero;
                vision.fireBeam();
            } else {
                System.out.println("hero is not Vision");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void scarletWitch(WitchHero hero) {
        System.out.println("scarletWitch running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof ScarletWitch) {
                ScarletWitch witch = (ScarletWitch) hero;
                witch.createIllusion();
            } else {
                System.out.println("hero is not ScarletWitch");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void wasp(InsectHero hero) {
        System.out.println("wasp running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Wasp) {
                Wasp wasp = (Wasp) hero;
                wasp.stingAttack();
            } else {
                System.out.println("hero is not Wasp");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void warMachine(TechPilot pilot) {
        System.out.println("warMachine running in Marvel1");
        if (pilot != null) {
            pilot.usePower();
            if (pilot instanceof WarMachine) {
                WarMachine rhodey = (WarMachine) pilot;
                rhodey.fireCannons();
            } else {
                System.out.println("pilot is not WarMachine");
            }
        } else {
            System.out.println("pilot is null");
        }
    }

    public void loki(MagicHero hero) {
        System.out.println("loki running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Loki) {
                Loki loki = (Loki) hero;
                loki.createClone();
            } else {
                System.out.println("hero is not Loki");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void starLord(SpaceWarrior hero) {
        System.out.println("starLord running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof StarLord) {
                StarLord star = (StarLord) hero;
                star.playMusic();
            } else {
                System.out.println("hero is not StarLord");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void drax(AlienFighter hero) {
        System.out.println("drax running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Drax) {
                Drax drax = (Drax) hero;
                drax.takeRevenge();
            } else {
                System.out.println("hero is not Drax");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void rocketRaccoon(RocketHero hero) {
        System.out.println("rocketRaccoon running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof RocketRaccoon) {
                RocketRaccoon rocket = (RocketRaccoon) hero;
                rocket.fixMachine();
            } else {
                System.out.println("hero is not RocketRaccoon");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void groot(TreeBeing hero) {
        System.out.println("groot running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Groot) {
                Groot groot = (Groot) hero;
                groot.sayName();
            } else {
                System.out.println("hero is not Groot");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void blackPanther1(WakandanWarrior hero) {
        System.out.println("blackPanther1 running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof BlackPanther1) {
                BlackPanther1 panther = (BlackPanther1) hero;
                panther.roar();
            } else {
                System.out.println("hero is not BlackPanther1");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void blackWidow1(SpyAgent hero) {
        System.out.println("blackWidow1 running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof BlackWidow1) {
                BlackWidow1 widow = (BlackWidow1) hero;
                widow.performTakedown();
            } else {
                System.out.println("hero is not BlackWidow1");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void hawkeye1(BowExpert hero) {
        System.out.println("hawkeye1 running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Hawkeye1) {
                Hawkeye1 hawk = (Hawkeye1) hero;
                hawk.aimTarget();
            } else {
                System.out.println("hero is not Hawkeye1");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void shuri(GeniusKid hero) {
        System.out.println("shuri running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Shuri) {
                Shuri shuri = (Shuri) hero;
                shuri.hackSystem();
            } else {
                System.out.println("hero is not Shuri");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void captainAmerica3(ShieldMaster1 hero) {
        System.out.println("captainAmerica3 running in Marvel1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof CaptainAmerica3) {
                CaptainAmerica3 cap = (CaptainAmerica3) hero;
                cap.inspireTroops();
            } else {
                System.out.println("hero is not CaptainAmerica3");
            }
        } else {
            System.out.println("hero is null");
        }
    }
}
