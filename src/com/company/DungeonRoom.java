package com.company;

public class DungeonRoom{
    int[] room;
    Monster monster;
    public DungeonRoom(){
        room = new int[5];
        for (int i = 1;i < room.length; i++) {

        }

        if(Math.random()<0.5){
            monster = new Barbarian();
            System.out.println("A barbarian is striking you");
        }else
            monster = new Monster();
        System.out.println("A monster is striking you");

    }

    public void openDoor(Explorer explorer){
        Monster.monsterAttack(explorer);

    }
}
