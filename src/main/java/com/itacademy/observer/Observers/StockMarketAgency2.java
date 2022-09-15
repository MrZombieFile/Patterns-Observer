package com.itacademy.observer.Observers;

import com.itacademy.observer.Observer;
import com.itacademy.observer.StockMarketAgent;

public class StockMarketAgency2 extends Observer{

    private String change;

    public StockMarketAgency2(StockMarketAgent agent){
        this.stockMarketAgent = agent;
        this.stockMarketAgent.addObserver(this);
    }


    @Override
    public void update(String change) {
        this.change = change;
    }

    public void getThings(){
        System.out.println(this.change);
    }
}