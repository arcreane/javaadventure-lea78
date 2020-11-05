package com.company;

import java.util.Random;

public class Monster {
    public int lifePoint;

    public Monster(){
        lifePoint = 20;
    }
    /*
        String[] monster = {"Barbare", "Sorcerer"};
        String monsterPicks = monster[rand.nextInt(monster.length)];

        for (int i = 0; i < monster.length; i++) {*/
    void sorcererInit(){
        System.out.println("\t## A dark wizard is behind the door ##");
        System.out.println("The dark wizard is launching a strike of lightning at you");
        Monster sorcerer = new Monster();
        sorcerer.SorcererAttack();

    }
    void SorcererAttack(){
        Armes lighteningStrike = new Armes();
        lighteningStrike.lightning();


    }
}
