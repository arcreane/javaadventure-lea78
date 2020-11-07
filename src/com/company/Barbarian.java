package com.company;

public class Barbarian extends Monster{
Weapons axe;


    public Barbarian() {
        weapon = axe;

    }
    public boolean attack(Player hero) {
        return hero.inflictDamage(weapon.getDamagePoint());

    }
    


}
