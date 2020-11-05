package com.company;

import java.util.Random;

public class Monster {
    public int lifePoint;


    public Monster(){
        lifePoint = 20;
    }

    void sorcererAttack(Explorer explorer){
        // création de l'arme du sorcier
        Armes lighteningStrike = new Armes();
        //effet de l'arme + appel méthode attaque spéciale
        for (int i = 0; i < explorer.lifePoint; i++) {
                explorer.lifePoint -= lighteningStrike.attackPoint;
                lighteningStrike.lightningEffect();
            if (explorer.lifePoint < 0) {
                break;
            }

        }

    }
}
