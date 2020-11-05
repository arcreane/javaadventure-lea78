package com.company;


public class Monster {
    int lifePoint;
    int attackPoint;



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
}




        //effet de l'arme + appel méthode attaque spéciale
        /*for (int i = 0; i < explorer.lifePoint; i++) {
                explorer.lifePoint -= lighteningStrike.attackPoint;
                lighteningStrike.lightningEffect();
            if (explorer.lifePoint < 0) {
                break;*/


