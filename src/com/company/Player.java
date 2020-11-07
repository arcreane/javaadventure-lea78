package com.company;

public class Player extends Character {
    Weapons Water_Flask;
    Weapons Sword;


    public Player(){
        Water_Flask = new Weapons();
        Sword = new Weapons();
        lifepoint = 200;
        weapon= Sword;
    }


   public boolean inflictDamage(int damagePoint){
        lifepoint -= damagePoint;
        if (lifepoint <= 0){
            System.out.println("You died, sorry!");
        }else {
            System.out.println("\t## You have lost : " + damagePoint + " life points!" +
                    "\n You only have: " + lifepoint + " life points remaining!");
        }
        return isAlive();
    }
}
