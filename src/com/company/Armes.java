package com.company;

import java.util.Random;

public class Armes {
    int attackPoint;
    Random randCritick = new Random();

    public Armes(){
        attackPoint = 10;
    }
    public void lightningEffect(){
        int strikeCriticParalysis = 10;
        if (randCritick.nextInt(100)<strikeCriticParalysis){
            System.out.println("sorcere can play two time");
            //add logique

        }
    }
}
