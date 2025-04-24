package com.rpg.battle.characters;

public abstract class Character {
    protected String name;
    protected int health;

    public Character(String  name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }

    public void takeDamage(int damage){
        this.health -= damage;
    }

    public boolean isAlive(){
        return health > 0;
    }

    public abstract void attack(Character target);
}
