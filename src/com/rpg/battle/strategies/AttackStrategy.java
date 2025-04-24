package com.rpg.battle.strategies;

import com.rpg.battle.characters.Character;

public interface AttackStrategy {
    void attack(Character attacker, Character target);
}
