package com.itacademy.observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarketAgent {

    private List<Observer> observers = new ArrayList<Observer>();
    private String changes;

    public String getChanges() { return this.changes; }

    public void setChanges( String changes){
        this.changes = changes;
        notifyChangesToObservers(changes);
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void notifyChangesToObservers(String change){
        observers.forEach(x -> x.update(change));
    }

}
