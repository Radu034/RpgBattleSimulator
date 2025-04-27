package com.rpg.battle;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import com.rpg.battle.characters.Warrior;
import com.rpg.battle.strategies.WeaponAttack;
import com.rpg.battle.strategies.MagicAttack;

public class WarriorTest {

    @Test
    public void testPhysicalAttackAppliesResistanceCorrectly(){
        Warrior attacker = new Warrior("Hero", 1, 2);
        Warrior target = new Warrior("Enemy", 2, 5);

        attacker.setAttackStrategy(new WeaponAttack());
        attacker.attack(target);

        assertEquals(92, target.getHealth(), "Expected 92 health after physical attack with a resistance of 2");
    }

    @Test
    public void testMagicAttackAppliesResistanceCorrectly(){
        Warrior attacker = new Warrior("Hero", 1, 2);
        Warrior target = new Warrior("Enemy", 2, 5);

        attacker.setAttackStrategy(new MagicAttack());
        attacker.attack(target);

        assertEquals(90, target.getHealth(), "Expected 93 health after magic attack with a resistance of 5");
    }

    @Test
    public void testRandomStrategyChanges(){
        Warrior warrior = new Warrior("Strategist", 2, 3);

        warrior.randomAttackStrategy();
        String firstStrategy = warrior.getAttackStrategy().getClass().getSimpleName();

        warrior.randomAttackStrategy();
        String secondStrategy = warrior.getAttackStrategy().getClass().getSimpleName();

        assertNotNull(firstStrategy);
        assertNotNull(secondStrategy);
        assertTrue(firstStrategy.equals("WeaponAttack") || firstStrategy.equals("MagicAttack"));
        assertTrue(secondStrategy.equals("WeaponAttack") || secondStrategy.equals("MagicAttack"));
    }
}
