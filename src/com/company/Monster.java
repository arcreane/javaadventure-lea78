package com.company;

public class Monster extends Character{

    public Monster(){
        lifepoint = 20;
        weapon = new Weapons();
    }


    //public boolean attack(Player hero) {
     //   return hero.inflictDamage(weapon.getDamagePoint());

   // }

    public boolean inflictDamage(int damagePoint) {
        lifepoint-= damagePoint;
        if (isAlive()){
            System.out.println("\t## The monster lost : " + damagePoint + " life points!" +
                    "\n That beast still has: " + lifepoint + " life points remaining!");

        }else {
            System.out.println("The monster is dead!\n " +
                    "----------------------------------------------\n" +
                    "\t## Enter the next room ##" +
                    "\n----------------------------------------------");

        }
        return isAlive();
    }
}
