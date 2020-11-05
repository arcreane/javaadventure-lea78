package com.company;

import java.util.Scanner;

public class Game {
    DungeonRoom[] roomArray;
    Explorer explorer;
    Monster sorcerer;
    Scanner scanInput = new Scanner(System.in);

    //constructor pour les 5 salles du donjon
    public Game(int totalNumbreOfRoom){
        roomArray = new DungeonRoom[totalNumbreOfRoom];
    }
    /*Quand ennemy meurt => on change de salle
    void changeRoom(){

        System.out.println("Behind the door is a ");

    }*/

    //appelle un monstre aléatoirement
    public void callAMonster(){
        int aleatoryMonster = (int)(Math.random()*2);

        switch (aleatoryMonster) {
            case 0= Integer.parseInt("Barbarian"):
                Monster barbarian = new Monster(20,10);
                Armes axe = new Armes(10);
            case 1:
                Monster sorcerer = new Monster(20,10);
                Armes lightening = new Armes(10);
            default:
                break;
        }
        System.out.println("## A dark"+ aleatoryMonster+" is behind the door ##");

    }

}
