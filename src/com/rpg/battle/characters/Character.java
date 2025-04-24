package com.rpg.battle.characters;

import com.rpg.battle.observers.BattleSubject;
import com.rpg.battle.strategies.AttackStrategy;

public abstract class Character {
    protected String name;
    protected int health;
    protected AttackStrategy attackStrategy;
    protected BattleSubject battleSubject;
    protected int physicalResistance;
    protected int magicResistance;

    public Character(String  name, int health, int physicalResistance, int magicResistance){
        this.name = name;
        this.health = health;
        this.physicalResistance = physicalResistance;
        this.magicResistance = magicResistance;
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

    public void takeDamage(int damage, String attackType){
        int finalDamage = 0;

        if(attackType.equals("physical")){
            finalDamage = Math.max(damage - physicalResistance, 0);
        }else if(attackType.equals("magic")){
            finalDamage = Math.max(damage - magicResistance, 0);
        }

        this.health -= finalDamage;
        if(battleSubject != null){
            battleSubject.notifyObservers(name + " took " + finalDamage + " " + attackType + " damage.");
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
