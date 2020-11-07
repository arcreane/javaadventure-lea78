package com.company;

import java.util.Random;

public class Sword extends Weapons{
    Random randCritick;

    public Sword(){

    }

    public boolean sword(){
        int strikeCritic = 10;
        randCritick.nextInt(100);
        if (randCritick.nextInt(100)<strikeCritic){
            return true;
        }else
            return false;
    }
}
