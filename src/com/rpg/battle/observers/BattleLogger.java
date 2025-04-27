package com.rpg.battle.observers;

public class BattleLogger implements BattleObserver{
    @Override
    public void onEvent(String event){
        System.out.println("[LOG] " + event);
    }
}
