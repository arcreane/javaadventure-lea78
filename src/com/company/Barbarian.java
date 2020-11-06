package com.company;

public class Barbarian extends Monster{
    int lifePoint;
    int attackPoint;


    public Barbarian() {
        Armes axe = new Armes(10);
        axe.axEffect();

    }
    public int lifeGauge() {
        return lifePoint;
    }


}
