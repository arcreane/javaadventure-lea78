package com.company;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        boolean runningTheGame;

        while(runningTheGame = true) {
            System.out.println("---Welcome to the Coding Dungeon---");
            System.out.println("###################################");
            System.out.println("Let enter the dungeon"+"\n");
            Explorer explorer = new Explorer(200, 10);
            DungeonRoom[] theDarkTower = new DungeonRoom[5];
            Game mygame = new Game();

            for (int i = 0; i < theDarkTower.length; i++) {
                theDarkTower[i].openDoor(explorer);
            }

            break;
        }

    }

}
