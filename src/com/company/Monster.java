package com.company;

import java.util.Random;

public class Monster {
    public int lifePoint;
    Random rand = new Random();

    public Monster() {
        String[] monster = {"Barbare", "Sorcerer"};
        String monsterPicks = monster[rand.nextInt(monster.length)];
    }
    void attack(){

    }
}
