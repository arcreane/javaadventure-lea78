package com.company;

import java.util.Random;

public class Armes {
    int attackPoint;
    Random randCritick = new Random();

    // constructeur arme point d'attaque de base
    public Armes(){
        attackPoint = 10;
    }
    // effet spécial épée
    public boolean sword(){
        int strikeCritic = 10;
        randCritick.nextInt(100);
        if (randCritick.nextInt(100)<strikeCritic){
            return true;
        }else
            return false;
    }

    // effet spécial de l'écalir
    public boolean lightningEffect(){
        int strikeCriticParalysis = 10;
        randCritick.nextInt(100);
        if (randCritick.nextInt(100)<strikeCriticParalysis){
            System.out.println("sorcerer can play two time");
            return true;
        }else
            return false;
    }
    //effet spécial hache
    public int axEffect(){
        int strikeCritic = 30;
        int addDamage = 0;
        randCritick.nextInt(100);
        if (randCritick.nextInt(100)<strikeCritic){
            addDamage = 10;
            return addDamage;
        }else
        return addDamage;
    }
}
