package com.rpg.battle;

import com.rpg.battle.characters.*;
import com.rpg.battle.observers.*;
import com.rpg.battle.strategies.*;

public class Main {
    public static void main(String[] args){
        BattleSubject subject = new BattleSubject();
        subject.addObserver(new BattleLogger());

        Warrior hero = new Warrior("Sir Ansbach", 4, 6);
        Warrior enemy = new Warrior("Sir Messmer", 6, 3);

        hero.randomAttackStrategy();
        enemy.randomAttackStrategy();

        hero.setBattleSubject(subject);
        enemy.setBattleSubject(subject);

        System.out.println("Combat begins!");

        while(hero.isAlive() && enemy.isAlive()){
            hero.attack(enemy);
            if(enemy.isAlive()){
                enemy.attack(hero);
            }

            hero.randomAttackStrategy();
            enemy.randomAttackStrategy();

            System.out.println(hero.getName() + " Health: " + hero.getHealth());
            System.out.println(enemy.getName() + " Health " + enemy.getHealth());
            System.out.println();
        }

        if(hero.isAlive()){
            System.out.println(hero.getName() + " wins!");
        }
        else{
            System.out.println(enemy.getName() + " wins!");
        }
    }
}
