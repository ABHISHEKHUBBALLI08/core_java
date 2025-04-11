package com.abhi.override.external;

import com.abhi.override.internal.*;

public class Xmen1 {

    public void wolverine(Xmen hero) {
        System.out.println("wolverine running in Xmen1");
        if (hero != null) {
            hero.mutant();
            if (hero instanceof Wolverine) {
                Wolverine wolverine = (Wolverine) hero;
                wolverine.mutantPower();
            } else {
                System.out.println("hero is not Wolverine");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void charlesXavier(Telepath hero) {
        System.out.println("charlesXavier running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof CharlesXavier) {
                CharlesXavier professor = (CharlesXavier) hero;
                professor.usePower();
            } else {
                System.out.println("hero is not CharlesXavier");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void jeanGrey(PhoenixHost hero) {
        System.out.println("jeanGrey running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof JeanGrey) {
                JeanGrey jean = (JeanGrey) hero;
                jean.telekineticBlast();
            } else {
                System.out.println("hero is not JeanGrey");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void erikLehnsherr(MagnetismMaster hero) {
        System.out.println("erikLehnsherr running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof ErikLehnsherr) {
                ErikLehnsherr magneto = (ErikLehnsherr) hero;
                magneto.usePower();
            } else {
                System.out.println("hero is not ErikLehnsherr");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void scottSummers(OpticBlaster hero) {
        System.out.println("scottSummers running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof ScottSummers) {
                ScottSummers cyclops = (ScottSummers) hero;
                cyclops.usePower();
            } else {
                System.out.println("hero is not ScottSummers");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void stormMonroe(WeatherController hero) {
        System.out.println("stormMonroe running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof StormMonroe) {
                StormMonroe storm = (StormMonroe) hero;
                storm.callRain();
            } else {
                System.out.println("hero is not StormMonroe");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void hankMcCoy(BeastlyMutant hero) {
        System.out.println("hankMcCoy running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof HankMcCoy) {
                HankMcCoy beast = (HankMcCoy) hero;
                beast.usePower();
            } else {
                System.out.println("hero is not HankMcCoy");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void mystique(Shapeshifter hero) {
        System.out.println("mystique running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Mystique) {
                Mystique mystique = (Mystique) hero;
                mystique.stealthAttack();
            } else {
                System.out.println("hero is not Mystique");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void elixir(Healer hero) {
        System.out.println("elixir running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Elixir) {
                Elixir elixir = (Elixir) hero;
                elixir.cureDisease();
            } else {
                System.out.println("hero is not Elixir");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void kittyPryde(Phaser hero) {
        System.out.println("kittyPryde running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof KittyPryde) {
                KittyPryde kitty = (KittyPryde) hero;
                kitty.phaseOthers();
            } else {
                System.out.println("hero is not KittyPryde");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void nightcrawler(TeleportingMutant hero) {
        System.out.println("nightcrawler running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Nightcrawler) {
                Nightcrawler nc = (Nightcrawler) hero;
                nc.usePower();
            } else {
                System.out.println("hero is not Nightcrawler");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void rogue(EnergyAbsorber hero) {
        System.out.println("rogue running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Rogue) {
                Rogue rogue = (Rogue) hero;
                rogue.mimicFlight();
            } else {
                System.out.println("hero is not Rogue");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void cable(TimeManipulator hero) {
        System.out.println("cable running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Cable) {
                Cable cable = (Cable) hero;
                cable.activateTechWeapon();
            } else {
                System.out.println("hero is not Cable");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void colossus(MetalSkinMutant hero) {
        System.out.println("colossus running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Colossus) {
                Colossus col = (Colossus) hero;
                col.punchGround();
            } else {
                System.out.println("hero is not Colossus");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void emmaFrost(PsychicMutant hero) {
        System.out.println("emmaFrost running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof EmmaFrost) {
                EmmaFrost emma = (EmmaFrost) hero;
                emma.diamondForm();
            } else {
                System.out.println("hero is not EmmaFrost");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void bishop(EnergyProjector hero) {
        System.out.println("bishop running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Bishop) {
                Bishop bishop = (Bishop) hero;
                bishop.chargeRifle();
            } else {
                System.out.println("hero is not Bishop");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void mastermind(Illusionist hero) {
        System.out.println("mastermind running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Mastermind) {
                Mastermind mm = (Mastermind) hero;
                mm.usePower();
            } else {
                System.out.println("hero is not Mastermind");
            }
        } else {
            System.out.println("hero is null");
        }
    }
    public void forge(WeatherMutant hero) {
        System.out.println("forge running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Forge) {
                Forge forge = (Forge) hero;
                forge.inventWeapon();
            } else {
                System.out.println("hero is not Forge");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void beast(BeastMutant hero) {
        System.out.println("beast running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Beast) {
                Beast beast = (Beast) hero;
                beast.usePower();
            } else {
                System.out.println("hero is not Beast");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void caliban(TrackerMutant hero) {
        System.out.println("caliban running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Caliban) {
                Caliban caliban = (Caliban) hero;
                caliban.detectFear();
            } else {
                System.out.println("hero is not Caliban");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void havok(PlasmaMutant hero) {
        System.out.println("havok running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Havok) {
                Havok havok = (Havok) hero;
                havok.energyBurst();
            } else {
                System.out.println("hero is not Havok");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void domino(ShadowMutant hero) {
        System.out.println("domino running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Domino) {
                Domino domino = (Domino) hero;
                domino.takeRisk();
            } else {
                System.out.println("hero is not Domino");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void magik(MagicUser hero) {
        System.out.println("magik running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Magik) {
                Magik magik = (Magik) hero;
                magik.summonSoulSword();
            } else {
                System.out.println("hero is not Magik");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void quicksilver(SpeedMutant hero) {
        System.out.println("quicksilver running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof Quicksilver) {
                Quicksilver quicksilver = (Quicksilver) hero;
                quicksilver.slowTimeEffect();
            } else {
                System.out.println("hero is not Quicksilver");
            }
        } else {
            System.out.println("hero is null");
        }
    }

    public void silverSamurai(SwordFighter hero) {
        System.out.println("silverSamurai running in Xmen1");
        if (hero != null) {
            hero.usePower();
            if (hero instanceof SilverSamurai) {
                SilverSamurai ss = (SilverSamurai) hero;
                ss.teleportWithArmor();
            } else {
                System.out.println("hero is not SilverSamurai");
            }
        } else {
            System.out.println("hero is null");
        }
    }



}
