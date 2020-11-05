package com.company;

import java.util.Scanner;

public class Game {
    DungeonRoom[] roomArray;
    Explorer explorer;
    Monster sorcerer;

    public boolean runningTheGame;


    void init(){
        System.out.println("---Welcome to the Coding Dungeon---");
        System.out.println("###################################");
        System.out.println("Let enter the dungeon"+"\n");

    }
    //constructor pour les 5 salles du donjon
    public Game(int totalNumbreOfRoom){
        roomArray = new DungeonRoom[totalNumbreOfRoom];

    }
    /*Quand ennemy meurt => on change de salle
    void changeRoom(){

        System.out.println("Behind the door is a ");

    }*/
    public void callAMonster(){
        System.out.println("\t## A dark wizard is behind the door ##");
        System.out.println("The dark wizard is launching a strike of lightning at you");
        sorcerer.sorcererAttack(explorer);
    }

}
