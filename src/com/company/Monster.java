package com.company;

public class Monster {
    int lifePoint;
    int attackPoint;


    public Monster() {
        lifePoint = 20;
        attackPoint = 10;
    }

    public int lifeGauge(int lifePoint) {
        this.lifePoint = lifePoint;
        return lifePoint;
    }

    public int monsterAttack(int attackPoint) {
        this.attackPoint = attackPoint;
        return attackPoint;
    }

    public void armeType(Armes lightening){


    }


        // création de l'arme du sorcier



        //effet de l'arme + appel méthode attaque spéciale
        /*for (int i = 0; i < explorer.lifePoint; i++) {
                explorer.lifePoint -= lighteningStrike.attackPoint;
                lighteningStrike.lightningEffect();
            if (explorer.lifePoint < 0) {
                break;*/

}
