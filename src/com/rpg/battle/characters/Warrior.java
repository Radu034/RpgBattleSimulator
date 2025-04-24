package com.rpg.battle.characters;

import com.rpg.battle.strategies.*;
import java.util.Random;

public class Warrior extends Character{
    public Warrior(String name, int physicalResistance, int magicResistance){
        super(name, 100, physicalResistance, magicResistance);
    }

    public void randomAttackStrategy(){
        Random random = new Random();
        int randomChoice = random.nextInt(2);

        if(randomChoice == 0){
            setAttackStrategy(new WeaponAttack());
        }else{
            setAttackStrategy(new MagicAttack());
        }
    }

}
