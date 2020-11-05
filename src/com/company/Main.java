package com.company;
import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {
        boolean runningTheGame;

        while(runningTheGame = true) {
            Game myGame = new Game(5);
            myGame.init();
            myGame.callAMonster();
        }

    }

}
