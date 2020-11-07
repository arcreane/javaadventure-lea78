package com.company;

public class Dungeon {
    Rooms roomArray[];

    public Dungeon(){
        roomArray = new Rooms[5];

        for (int i = 0; i < roomArray.length; i++) {
            roomArray[i] = new Rooms();
        }
    }

    public void visit(Player hero) {
        for (Rooms room: roomArray) {
            room.openDoor(hero);
            if(!hero.isAlive()){
                break;
            }
        }
        if (hero.isAlive()) {
            System.out.println("----You win the treasure, congrats !----");
        }
        else{
            System.out.println("Sorry you lost!");
        }
    }
}
