package com.rpg.battle.strategies;

import com.rpg.battle.characters.Character;

public class MagicAttack implements AttackStrategy {
    @Override
    public void attack(Character attacker, Character target){
        int damage = 15;
        target.takeDamage(damage);
        System.out.println(attacker.getName() + " throws a magic spell at " + target.getName() + " for " + damage + " damage.");
    }
}
