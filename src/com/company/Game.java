package com.company;

import java.util.Scanner;

public class Game {
    DungeonRoom[] roomArray;
    Explorer explorer;
    Monster sorcerer;
    Barbarian barbarian;
    Scanner scanInput = new Scanner(System.in);

    //constructor initial : pour les 5 salles du donjon + aventurier
    public Game(int totalNumbreOfRoom){
        roomArray = new DungeonRoom[totalNumbreOfRoom];
        explorer = new Explorer(200,10);
    }
    /*Quand ennemy meurt => on change de salle
    void changeRoom(){

        System.out.println("Behind the door is a ");

    }*/


    //appelle un monstre aléatoirement
    public int callAMonster() {
            int aleatoryMonster = (int) (Math.random() * 2);

            switch (aleatoryMonster) {
                case 0:
                    System.out.println("## A ferocious barbarian is behind the door ##");
                    barbarian = new Barbarian ();
                    Armes axe = new Armes(10);
                    barbarian.monsterAttack(explorer);
                    System.out.println("The Barbarian is striking you with his axe you lost: " + axe.attackPoint);
                    explorer.lifePoint = explorer.lifePoint - axe.attackPoint;
                    System.out.println(" you still have "+ explorer.lifePoint);

                    return explorer.lifePoint;
                case 1:
                    System.out.println("## A dark wizard is behind the door ##");
                    sorcerer = new Monster(20, 10);
                    Armes lightening = new Armes(10);
                    sorcerer.monsterAttack(explorer);
                    System.out.println("The Barbarian is striking you with his axe you lost: " + lightening.attackPoint);
                    explorer.lifePoint = explorer.lifePoint - lightening.attackPoint;
                    System.out.println(" you still have "+ explorer.lifePoint);

                    return explorer.lifePoint;
                default:
                    break;
            }
            return explorer.lifePoint;

    }

    void strikingattack() {

    }

    public Explorer getExplorer() {
        return explorer;
    }
}
