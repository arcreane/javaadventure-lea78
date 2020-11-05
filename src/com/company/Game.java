package com.company;

import java.util.Scanner;

public class Game {
    DungeonRoom[] roomArray;


    void init(){
        System.out.println("---Welcome to the Coding Dungeon---");
        System.out.println("###################################"+"\n");
        System.out.println("Let enter the dungeon");
    }
    //constructor pour les 5 salles du donjon
    public Game(int totalNumbreOfRoom){
        roomArray = new DungeonRoom[totalNumbreOfRoom];
        
    }
}
