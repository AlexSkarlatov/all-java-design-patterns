package com.skarlatov.observerDesignPattern.ObserverChallenge;

public class Client {
    public static void main(String[] args){
        //create objects for testing, these objects will obesrve our pheonmena
        AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
        CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

        // pass the displays to cricket data
        // pass the observers to the subject, so the subject may notify any updates
        CricketData cricketData = new CricketData();

        // register these elements
        cricketData.registerObserver(averageScoreDisplay);
        cricketData.registerObserver(currentScoreDisplay);

        // in a real app you would have osme logic to call this function when data changes
        cricketData.dataChanged();

        //remove an observer
        cricketData.unregisterObserver(averageScoreDisplay);

        //now only current dispaly gets the notification
        cricketData.dataChanged();
    }

}
