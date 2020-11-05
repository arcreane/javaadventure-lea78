package com.company;

public class Explorer {
    int lifePoint;
    int attackPoint;



    public Explorer(int eLifePoint, int eAttackPoint) {
        eLifePoint = lifePoint;
        eAttackPoint = attackPoint;
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
