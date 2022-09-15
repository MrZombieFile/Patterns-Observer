package com.itacademy;

import com.itacademy.observer.Observers.StockMarketAgency1;
import com.itacademy.observer.Observers.StockMarketAgency2;
import com.itacademy.observer.Observers.StockMarketAgency3;
import com.itacademy.observer.StockMarketAgent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
/*
 This program is the implementation of an Observer pattern
 */


    public static void main (String[] args) {
        StockMarketAgent bestBroker = new StockMarketAgent();

        StockMarketAgency1 agency1 = new StockMarketAgency1(bestBroker);
        StockMarketAgency2 agency2 = new StockMarketAgency2(bestBroker);
        StockMarketAgency3 agency3 = new StockMarketAgency3(bestBroker);

        bestBroker.addObserver(agency1);
        bestBroker.addObserver(agency2);
        bestBroker.addObserver(agency3);

        bestBroker.setChanges("Huge move on $AMZN");
        agency1.getThings();
        agency2.getThings();
        agency3.getThings();

        bestBroker.setChanges("Dividends on $BAC");
        agency1.getThings();
        agency2.getThings();
        agency3.getThings();

        bestBroker.setChanges("News of today's market");
        agency1.getThings();
        agency2.getThings();
        agency3.getThings();
    }


}
