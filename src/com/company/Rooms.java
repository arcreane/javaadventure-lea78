package com.company;

public class Rooms {
    Monster monstre;

    public Rooms(){
        monstre = new Monster();
    }
    public void openDoor(Player hero) {
        while (hero.isAlive()&& monstre.isAlive()){
            if (!monstre.attack(hero))
                break;

            if (!hero.attack(monstre))
                break;
        }
    }
}
