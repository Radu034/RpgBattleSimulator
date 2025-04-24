package com.rpg.battle;

import com.rpg.battle.characters.*;

public class Main {
    public static void main(String[] args){
        Warrior hero = new Warrior("Laurentiu");
        Warrior enemy = new Warrior("Sir Messmer");

        System.out.println("Combat begins!");

        while(hero.isAlive() && enemy.isAlive()){
            hero.attack(enemy);
            if(enemy.isAlive()){
                enemy.attack(hero);
            }
            System.out.println(hero.getName() + " Health: " + hero.getHealth());
            System.out.println(enemy.getName() + " Health " + enemy.getHealth());
            System.out.println();
        }

        if(hero.isAlive()){
            System.out.println(hero.getName() + " wins!");
        }
        else{
            System.out.println(enemy.getName() + "wins!");
        }
    }
}
