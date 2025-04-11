package com.abhi.overide4.external;

import com.abhi.overide4.internal.*;


public class HarryPotter1 {
    public void harry(Wizard wizard){
        System.out.println("harry running in HarryPotter1");
        if(wizard!=null){
            wizard.usePower();
            if(wizard instanceof HarryPotter){
                HarryPotter harryPotter=(HarryPotter) wizard;
                harryPotter.summonPatronus();
            }
            else {
                System.out.println("wizard is not HarryPotter");
            }
        }else{
            System.out.println("harry is null");
        }
    }
    public void hermione(Witch witch){
        System.out.println("hermione running in HarryPotter1");
        if(witch != null){
            witch.usePower();
            if(witch instanceof HermioneGranger){
                HermioneGranger hermione = (HermioneGranger) witch;
                hermione.useTimeTurner();
            } else {
                System.out.println("witch is not HermioneGranger");
            }
        } else {
            System.out.println("hermione is null");
        }
    }
    public void voldemort(DarkLord darkLord){
        System.out.println("voldemort running in HarryPotter1");
        if(darkLord != null){
            darkLord.usePower();
            if(darkLord instanceof Voldemort){
                Voldemort voldemort = (Voldemort) darkLord;
                voldemort.castAvadaKedavra();
            } else {
                System.out.println("darkLord is not Voldemort");
            }
        } else {
            System.out.println("voldemort is null");
        }
    }
    public void dumbledore(Headmaster headmaster){
        System.out.println("dumbledore running in HarryPotter1");
        if(headmaster != null){
            headmaster.usePower();
            if(headmaster instanceof Dumbledore){
                Dumbledore dumbledore = (Dumbledore) headmaster;
                dumbledore.useElderWand();
            } else {
                System.out.println("headmaster is not Dumbledore");
            }
        } else {
            System.out.println("dumbledore is null");
        }
    }
    public void snape(PotionMaster potionMaster){
        System.out.println("snape running in HarryPotter1");
        if(potionMaster != null){
            potionMaster.usePower();
            if(potionMaster instanceof Snape){
                Snape snape = (Snape) potionMaster;
                snape.brewPotion();
            } else {
                System.out.println("potionMaster is not Snape");
            }
        } else {
            System.out.println("snape is null");
        }
    }
    public void lupin(Werewolf werewolf){
        System.out.println("lupin running in HarryPotter1");
        if(werewolf != null){
            werewolf.usePower();
            if(werewolf instanceof Lupin){
                Lupin lupin = (Lupin) werewolf;
                lupin.transformAtFullMoon();
            } else {
                System.out.println("werewolf is not Lupin");
            }
        } else {
            System.out.println("lupin is null");
        }
    }
    public void sirius(Animagus animagus){
        System.out.println("sirius running in HarryPotter1");
        if(animagus != null){
            animagus.usePower();
            if(animagus instanceof SiriusBlack){
                SiriusBlack sirius = (SiriusBlack) animagus;
                sirius.transformToDog();
            } else {
                System.out.println("animagus is not SiriusBlack");
            }
        } else {
            System.out.println("sirius is null");
        }
    }
    public void trelawney(Seer seer){
        System.out.println("trelawney running in HarryPotter1");
        if(seer != null){
            seer.usePower();
            if(seer instanceof Trelawney){
                Trelawney trelawney = (Trelawney) seer;
                trelawney.predictFuture();
            } else {
                System.out.println("seer is not Trelawney");
            }
        } else {
            System.out.println("trelawney is null");
        }
    }
    public void filch(Caretaker caretaker){
        System.out.println("filch running in HarryPotter1");
        if(caretaker != null){
            caretaker.usePower();
            if(caretaker instanceof Filch){
                Filch filch = (Filch) caretaker;
                filch.cleanCastle();
            } else {
                System.out.println("caretaker is not Filch");
            }
        } else {
            System.out.println("filch is null");
        }
    }
    public void hagrid1(Giant giant){
        System.out.println("hagrid running in HarryPotter1");
        if(giant != null){
            giant.usePower();
            if(giant instanceof Hagrid){
                Hagrid hagrid = (Hagrid) giant;
                hagrid.tameCreatures();
            } else {
                System.out.println("giant is not Hagrid");
            }
        } else {
            System.out.println("hagrid is null");
        }
    }
    public void nearlyHeadlessNick(Ghost ghost){
        System.out.println("nearlyHeadlessNick running in HarryPotter1");
        if(ghost != null){
            ghost.usePower();
            if(ghost instanceof NearlyHeadlessNick){
                NearlyHeadlessNick nick = (NearlyHeadlessNick) ghost;
                nick.hauntHogwarts();
            } else {
                System.out.println("ghost is not NearlyHeadlessNick");
            }
        } else {
            System.out.println("nearlyHeadlessNick is null");
        }
    }
    public void hagrid(Giant giant) {
        System.out.println("hagrid running in HarryPotter1");
        if (giant != null) {
            giant.usePower();
            if (giant instanceof Hagrid) {
                Hagrid hagrid = (Hagrid) giant;
                hagrid.tameCreatures();
            } else {
                System.out.println("giant is not Hagrid");
            }
        } else {
            System.out.println("hagrid is null");
        }
    }
    public void nick(Ghost ghost) {
        System.out.println("nick running in HarryPotter1");
        if (ghost != null) {
            ghost.usePower();
            if (ghost instanceof NearlyHeadlessNick) {
                NearlyHeadlessNick nick = (NearlyHeadlessNick) ghost;
                nick.hauntHogwarts();
            } else {
                System.out.println("ghost is not NearlyHeadlessNick");
            }
        } else {
            System.out.println("nick is null");
        }
    }
    public void dobby(Elf elf) {
        System.out.println("dobby running in HarryPotter1");
        if (elf != null) {
            elf.usePower();
            if (elf instanceof Dobby) {
                Dobby dobby = (Dobby) elf;
                dobby.protectHarry();
            } else {
                System.out.println("elf is not Dobby");
            }
        } else {
            System.out.println("dobby is null");
        }
    }
    public void ginny(QuidditchPlayer player) {
        System.out.println("ginny running in HarryPotter1");
        if (player != null) {
            player.usePower();
            if (player instanceof GinnyWeasley) {
                GinnyWeasley ginny = (GinnyWeasley) player;
                ginny.scoreGoal();
            } else {
                System.out.println("player is not GinnyWeasley");
            }
        } else {
            System.out.println("ginny is null");
        }
    }
    public void tonks(Auror auror) {
        System.out.println("tonks running in HarryPotter1");
        if (auror != null) {
            auror.usePower();
            if (auror instanceof Tonks) {
                Tonks tonks = (Tonks) auror;
                tonks.shapeShift();
            } else {
                System.out.println("auror is not Tonks");
            }
        } else {
            System.out.println("tonks is null");
        }
    }
    public void bellatrix(DeathEater eater) {
        System.out.println("bellatrix running in HarryPotter1");
        if (eater != null) {
            eater.usePower();
            if (eater instanceof Bellatrix) {
                Bellatrix bellatrix = (Bellatrix) eater;
                bellatrix.duel();
            } else {
                System.out.println("eater is not Bellatrix");
            }
        } else {
            System.out.println("bellatrix is null");
        }
    }
    public void draco(Slytherin slytherin) {
        System.out.println("draco running in HarryPotter1");
        if (slytherin != null) {
            slytherin.usePower();
            if (slytherin instanceof DracoMalfoy) {
                DracoMalfoy draco = (DracoMalfoy) slytherin;
                draco.castSerpent();
            } else {
                System.out.println("slytherin is not DracoMalfoy");
            }
        } else {
            System.out.println("draco is null");
        }
    }
    public void neville(Gryffindor gryffindor) {
        System.out.println("neville running in HarryPotter1");
        if (gryffindor != null) {
            gryffindor.usePower();
            if (gryffindor instanceof NevilleLongbottom) {
                NevilleLongbottom neville = (NevilleLongbottom) gryffindor;
                neville.killNagini();
            } else {
                System.out.println("gryffindor is not NevilleLongbottom");
            }
        } else {
            System.out.println("neville is null");
        }
    }
    public void luna(Ravenclaw ravenclaw) {
        System.out.println("luna running in HarryPotter1");
        if (ravenclaw != null) {
            ravenclaw.usePower();
            if (ravenclaw instanceof LunaLovegood) {
                LunaLovegood luna = (LunaLovegood) ravenclaw;
                luna.talkToCreatures();
            } else {
                System.out.println("ravenclaw is not LunaLovegood");
            }
        } else {
            System.out.println("luna is null");
        }
    }
    public void cedric(Hufflepuff hufflepuff) {
        System.out.println("cedric running in HarryPotter1");
        if (hufflepuff != null) {
            hufflepuff.usePower();
            if (hufflepuff instanceof CedricDiggory) {
                CedricDiggory cedric = (CedricDiggory) hufflepuff;
                cedric.duelFair();
            } else {
                System.out.println("hufflepuff is not CedricDiggory");
            }
        } else {
            System.out.println("cedric is null");
        }
    }
    public void fudge(MinistryOfficial official) {
        System.out.println("fudge running in HarryPotter1");
        if (official != null) {
            official.usePower();
            if (official instanceof Fudge) {
                Fudge fudge = (Fudge) official;
                fudge.issueDecree();
            } else {
                System.out.println("official is not Fudge");
            }
        } else {
            System.out.println("fudge is null");
        }
    }
    public void firenze(Centaur centaur){
        System.out.println("firenze running in HarryPotter1");
        if(centaur != null){
            centaur.usePower();
            if(centaur instanceof Firenze){
                Firenze firenze = (Firenze) centaur;
                firenze.readStars();
            } else {
                System.out.println("centaur is not Firenze");
            }
        } else {
            System.out.println("firenze is null");
        }
    }
    public void lockhart(DuelMaster duelMaster){
        System.out.println("lockhart running in HarryPotter1");
        if(duelMaster != null){
            duelMaster.usePower();
            if(duelMaster instanceof GilderoyLockhart){
                GilderoyLockhart lockhart = (GilderoyLockhart) duelMaster;
                lockhart.eraseMemory();
            } else {
                System.out.println("duelMaster is not GilderoyLockhart");
            }
        } else {
            System.out.println("lockhart is null");
        }
    }


}
