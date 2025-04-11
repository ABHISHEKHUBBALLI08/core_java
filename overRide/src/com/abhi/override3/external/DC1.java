package com.abhi.override3.external;

import com.abhi.override3.internal.*;

public class DC1 {

    public void superman(Kryptonian hero) {
        System.out.println("superman running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Superman) {
                Superman superman = (Superman) hero;
                superman.fly();
            } else {
                System.out.println("hero is not Superman");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void batman(DarkKnight hero) {
        System.out.println("batman running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Batman) {
                Batman batman = (Batman) hero;
                batman.usePower();
            } else {
                System.out.println("hero is not Batman");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void wonderWoman(Amazonian hero) {
        System.out.println("wonderWoman running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof WonderWoman) {
                WonderWoman diana = (WonderWoman) hero;
                diana.useLasso();
            } else {
                System.out.println("hero is not WonderWoman");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void flash(Speedster hero) {
        System.out.println("flash running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Flash) {
                Flash flash = (Flash) hero;
                flash.timeTravel();
            } else {
                System.out.println("hero is not Flash");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void aquaman(Atlantean hero) {
        System.out.println("aquaman running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Aquaman) {
                Aquaman aquaman = (Aquaman) hero;
                aquaman.summonSeaCreatures();
            } else {
                System.out.println("hero is not Aquaman");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void greenArrow(Archer hero) {
        System.out.println("greenArrow running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof GreenArrow) {
                GreenArrow greenArrow = (GreenArrow) hero;
                greenArrow.shootArrow();
            } else {
                System.out.println("hero is not GreenArrow");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void martianManhunter(AlienMartian hero) {
        System.out.println("martianManhunter running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof MartianManhunter) {
                MartianManhunter martian = (MartianManhunter) hero;
                martian.shapeShift();
            } else {
                System.out.println("hero is not MartianManhunter");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void cyborg(TechExpert hero) {
        System.out.println("cyborg running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Cyborg) {
                Cyborg cyborg = (Cyborg) hero;
                cyborg.fireCannon();
            } else {
                System.out.println("hero is not Cyborg");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void greenLantern(LanternWielder hero) {
        System.out.println("greenLantern running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof GreenLantern) {
                GreenLantern lantern = (GreenLantern) hero;
                lantern.createConstructs();
            } else {
                System.out.println("hero is not GreenLantern");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void reneeMontoya(Detective hero) {
        System.out.println("reneeMontoya running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof ReneeMontoya) {
                ReneeMontoya renee = (ReneeMontoya) hero;
                renee.solveCrime();
            } else {
                System.out.println("hero is not ReneeMontoya");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void zatanna(Magician hero) {
        System.out.println("zatanna running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Zatanna) {
                Zatanna zatanna = (Zatanna) hero;
                zatanna.castSpell();
            } else {
                System.out.println("hero is not Zatanna");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void beastBoy(BeastHero hero) {
        System.out.println("beastBoy running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof BeastBoy) {
                BeastBoy beastBoy = (BeastBoy) hero;
                beastBoy.transformAnimal();
            } else {
                System.out.println("hero is not BeastBoy");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void raven(ShadowHero hero) {
        System.out.println("raven running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Raven) {
                Raven raven = (Raven) hero;
                raven.useDarkness();
            } else {
                System.out.println("hero is not Raven");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void artemis(Archerette hero) {
        System.out.println("artemis running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Artemis) {
                Artemis artemis = (Artemis) hero;
                artemis.launchArrow();
            } else {
                System.out.println("hero is not Artemis");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void joker(Trickster hero) {
        System.out.println("joker running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Joker) {
                Joker joker = (Joker) hero;
                joker.causeChaos();
            } else {
                System.out.println("hero is not Joker");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void killerFrost(IceController hero) {
        System.out.println("killerFrost running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof KillerFrost) {
                KillerFrost frost = (KillerFrost) hero;
                frost.freezeEnemy();
            } else {
                System.out.println("hero is not KillerFrost");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void maxima(TelekineticHero hero) {
        System.out.println("maxima running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Maxima) {
                Maxima maxima = (Maxima) hero;
                maxima.moveObjects();
            } else {
                System.out.println("hero is not Maxima");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void redTornado(RobotFighter hero) {
        System.out.println("redTornado running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof RedTornado) {
                RedTornado red = (RedTornado) hero;
                red.spinAttack();
            } else {
                System.out.println("hero is not RedTornado");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void redHood(AntiHero hero) {
        System.out.println("redHood running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof RedHood) {
                RedHood redHood = (RedHood) hero;
                redHood.dualPistols();
            } else {
                System.out.println("hero is not RedHood");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void firestorm(ElementalHero hero) {
        System.out.println("firestorm running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Firestorm) {
                Firestorm firestorm = (Firestorm) hero;
                firestorm.atomicBlast();
            } else {
                System.out.println("hero is not Firestorm");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void scarecrow(FearMaster hero) {
        System.out.println("scarecrow running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Scarecrow) {
                Scarecrow scare = (Scarecrow) hero;
                scare.spreadFearGas();
            } else {
                System.out.println("hero is not Scarecrow");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void deadshot(Gunner hero) {
        System.out.println("deadshot running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Deadshot) {
                Deadshot floyd = (Deadshot) hero;
                floyd.perfectAim();
            } else {
                System.out.println("hero is not Deadshot");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void shazam(Demigod hero) {
        System.out.println("shazam running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Shazam) {
                Shazam billy = (Shazam) hero;
                billy.channelLightning();
            } else {
                System.out.println("hero is not Shazam");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void mera(AquaticHero hero) {
        System.out.println("mera running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Mera) {
                Mera mera = (Mera) hero;
                mera.controlWater();
            } else {
                System.out.println("hero is not Mera");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void constantine(MysticRogue hero) {
        System.out.println("constantine running in DC1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Constantine) {
                Constantine john = (Constantine) hero;
                john.exorciseDemon();
            } else {
                System.out.println("hero is not Constantine");
            }
        } else {
            System.out.println("hero is null");
        }
    }

}
