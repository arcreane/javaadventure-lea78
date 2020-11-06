package com.company;


public class Monster {
   protected int lifePoint;
   protected int dammage;
   protected Armes arme;


    public Monster(int lifePoint, int attackPoint) {
        this.dammage = attackPoint;
        this.lifePoint = lifePoint;
        Armes lightening = new Armes(10);
        lightening.lightningEffect();
    }

    public Monster() {
    }


    public int lifeGauge() {
        return lifePoint;
    }

    public void monsterAttack(Explorer explorer) {
        /*explorer.lifePoint = explorer.lifePoint -
        return dammage;}
        */
    }
}




        //effet de l'arme + appel méthode attaque spéciale
        /*for (int i = 0; i < explorer.lifePoint; i++) {
                explorer.lifePoint -= lighteningStrike.attackPoint;
                lighteningStrike.lightningEffect();
            if (explorer.lifePoint < 0) {
                break;*/


