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


    void attackAmount(int attackPoint){
        this.attackPoint = attackPoint;

    }

}
