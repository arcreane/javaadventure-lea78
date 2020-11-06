package com.company;


public class Monster {
    int lifePoint;
    int attackPoint;




    public Monster(int lifePoint, int attackPoint) {
        this.attackPoint = attackPoint;
        this.lifePoint = lifePoint;
        Armes lightening = new Armes(10);
    }

    public Monster() {
    }


    public int lifeGauge() {
        return lifePoint;
    }

    public int monsterAttack(Explorer explorer) {
        return attackPoint;
    }
}




        //effet de l'arme + appel méthode attaque spéciale
        /*for (int i = 0; i < explorer.lifePoint; i++) {
                explorer.lifePoint -= lighteningStrike.attackPoint;
                lighteningStrike.lightningEffect();
            if (explorer.lifePoint < 0) {
                break;*/


