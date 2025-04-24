package com.rpg.battle.strategies;

import com.rpg.battle.characters.Character;

public class MagicAttack implements AttackStrategy {
    @Override
    public void attack(Character attacker, Character target){
        int damage = 15;
        System.out.println(attacker.getName() + " casts a spell on " + target.getName() + " for " + damage + " magic damage.");
        target.takeDamage(damage, "magic");
    }
}
