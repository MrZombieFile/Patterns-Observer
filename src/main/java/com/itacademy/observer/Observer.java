package com.itacademy.observer;

public abstract class Observer {

    protected StockMarketAgent stockMarketAgent; //(Subject)
    public abstract void update(String change);

}
