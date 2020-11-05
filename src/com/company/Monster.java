package com.company;

import java.util.Random;

public class Monster {
    int lifePoint;
    int attackPoint;
    Armes axe;
    Armes lightening;
    Random randTypeMonster = new Random();


    public Monster(int lifePoint, int attackPoint) {
        this.attackPoint = attackPoint;
        this.lifePoint = lifePoint;
    }

    public int lifeGauge() {
        return lifePoint;
    }

    public int monsterAttack() {
        return attackPoint;
    }

    public void armeType(){
        this.axe = axe;
        this.lightening = lightening;

    }




}


        // création de l'arme du sorcier



        //effet de l'arme + appel méthode attaque spéciale
        /*for (int i = 0; i < explorer.lifePoint; i++) {
                explorer.lifePoint -= lighteningStrike.attackPoint;
                lighteningStrike.lightningEffect();
            if (explorer.lifePoint < 0) {
                break;*/


