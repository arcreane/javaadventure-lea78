package com.company;

public class Character {
     protected int lifepoint;
    Weapons weapon;

    public Character() {

    }

    public boolean isAlive() {
        return lifepoint > 0;
    }
    public boolean attack(Character charaBeingAttack) {
        return charaBeingAttack.inflictDamage(weapon.getDamagePoint());
    }
    public boolean inflictDamage(int damagePoint){
        return true;
    }
}
