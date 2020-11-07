package com.company;

public class Rooms {
    Monster monstre;
    Barbarian wildBarbarian;
    Sorcerer darkSorcere;

    // une salle = un monstre
    public Rooms(){
        monstre = new Monster();
    }

    //action quand une porte est ouverte = monstre attaque
    public void openDoor(Player hero) {
        while (hero.isAlive()&& monstre.isAlive()){
            aleatoryMonster();
            if (!monstre.attack(hero))
                break;

            if (!hero.attack(monstre))
                break;
        }
    }
    public void aleatoryMonster() {
        int aleatory = (int) (Math.random() * 2);
        switch (aleatory) {
            case 0:
                this.monstre = wildBarbarian;
            case 1:
                this.monstre = darkSorcere;
            default:
                break;
        }
    }

}
