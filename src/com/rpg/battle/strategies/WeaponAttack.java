package com.rpg.battle.strategies;

import com.rpg.battle.characters.Character;

public class WeaponAttack implements AttackStrategy{
    @Override
    public void attack(Character attacker, Character target){
        int damage = 10;
        target.takeDamage(damage);
        System.out.println(attacker.getName() + " hits " + target.getName() + " for " + damage + " physical damage.");
    }
}
