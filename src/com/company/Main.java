package com.company;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        boolean runningTheGame;

        while(runningTheGame = true) {
            Dungeon theDarkTower = new Dungeon();
            Player Silaine = new Player();
            System.out.println("---Welcome to the Coding Dungeon---");
            System.out.println("###################################");
            System.out.println("Let enter the dungeon"+"\n");
            theDarkTower.visit(Silaine);


            break;
        }

    }

}
