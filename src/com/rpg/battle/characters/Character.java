package com.rpg.battle.characters;

import com.rpg.battle.strategies.AttackStrategy;

public abstract class Character {
    protected String name;
    protected int health;
    protected AttackStrategy attackStrategy;

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

    public void setAttackStrategy(AttackStrategy attackStrategy){
        this.attackStrategy = attackStrategy;
    }
    public void attack(Character target){
        if(attackStrategy != null){
            attackStrategy.attack(this, target);
        }else{
            System.out.println(name + "has no attack strategy!");
        }
    }
}
