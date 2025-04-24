package com.rpg.battle.observers;

import java.util.ArrayList;
import java.util.List;

public class BattleSubject {
    private final List<BattleObserver> observers = new ArrayList<>();

    public void addObserver(BattleObserver observer){
        observers.add(observer);
    }

    public void notifyObservers(String event){
        for(BattleObserver observer : observers){
            observer.onEvent(event);
        }
    }
}
