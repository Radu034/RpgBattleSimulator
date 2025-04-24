package com.rpg.battle.characters;

public class Warrior extends Character{
    public Warrior(String name){
        super(name, 100);
    }

    @Override
    public void attack(Character target){
        int damage = 10;
        target.takeDamage(damage);
        System.out.println(name + " attacks " + target.getName() + " for " + damage + " damage.");
    }
}
