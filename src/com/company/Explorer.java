package com.company;

public class Explorer {
    int lifePoint;
    int attackPoint;



    public Explorer(int eLifePoint, int eAttackPoint) {
        this.lifePoint =eLifePoint;
        this.attackPoint = eAttackPoint;

    }

    public int lifeGauge(int lifePoint){
        this.lifePoint = lifePoint;
        return lifePoint;
    }


    public int explorerAttack(int attackPoint){
        this.attackPoint = attackPoint;
        return attackPoint;
    }
    public void weapon(){

    }


}
