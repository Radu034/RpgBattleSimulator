package com.rpg.battle.characters;

import com.rpg.battle.observers.BattleSubject;
import com.rpg.battle.strategies.AttackStrategy;

public abstract class Character {
    protected String name;
    protected int health;
    protected AttackStrategy attackStrategy;
    protected BattleSubject battleSubject;

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

    public void setBattleSubject(BattleSubject subject){
        this.battleSubject = subject;
    }

    public void takeDamage(int damage){
        this.health -= damage;
        if(battleSubject != null){
            battleSubject.notifyObservers(name + " took " + damage + " damage.");
            if(!isAlive()){
                battleSubject.notifyObservers(name + " has been defeated!");
            }
        }
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
