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
    public void callAMonster(){
        System.out.println(" Behind the door is a dangerous monster!");
        Monster monster = new Monster(20,10);
        monster.monsterAttack();
        monster.lifeGauge();

        int typeOfMonster = (int)(Math.random()*2);
        switch (typeOfMonster) {
            case 0:
                System.out.println("## A Barbarian is behind the door ##");
                Armes axe = new Armes(10);
                return;
            case 1:
                System.out.println("## A dark wizard is behind the door ##");
                Armes lightening = new Armes(10);
                return;
            default:
                break;
        }
    }

}
