package com.company;

public class Dungeon {
    Rooms roomArray[];

    //constructeur du Donjon
    public Dungeon(){
        roomArray = new Rooms[5];

        for (int i = 0; i < roomArray.length; i++) {
            roomArray[i] = new Rooms();
        }
    }

    //Ouvre une nouvelle salle tant que condition isAlive est rempli
    public void visit(Player hero) {
        for (Rooms room: roomArray) {
            room.openDoor(hero);
            if(!hero.isAlive()){
                break;
            }
        }
        if (hero.isAlive()) {
            System.out.println("\t----You win the treasure, congrats !----");
        }
        else{
            System.out.println("Sorry you lost!");
        }
    }
}
