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
            Game myGame = new Game(5);
            Explorer Silaine = new Explorer(200,10);
            myGame.callAMonster();
            break;
        }

    }

}
