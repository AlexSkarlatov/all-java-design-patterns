package com.skarlatov.observerDesignPattern.ObserverChallenge;

import java.util.ArrayList;
import java.util.Iterator;

public interface Subject {

    public void registerObserver(Observer observer);
    public void unregisterObserver(Observer observer);
    public void notifyObservers();
}



class CricketData implements Subject{
    //state that is meant to be broadcasted
    int runs = 9;
    int wickets = 99;
    float overs = (float) 10.2;

    ArrayList<Observer> observerArrayList;

    public CricketData(){
        observerArrayList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if(observer == null) return;
        if(!observerArrayList.contains(observer)){
            observerArrayList.add(observer);
        }
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observerArrayList.remove(observer);
    }


    @Override
    public void notifyObservers() {
//        for(Observer o : observerArrayList){
//            o.update(this.runs,this.wickets, this.overs);
//        }
        for(Iterator<Observer> it = observerArrayList.iterator(); it.hasNext();){
            Observer observer = it.next();
            observer.update(this.runs,this.wickets,this.overs);
        }
    }


    private int getLatestRuns(){
        return this.runs;

    }
    private int getLatestWickets(){
        return this.wickets;
    }
    private float getLatestOvers(){
        return this.overs;
    }

    // this method is used to update the displays when data changes
    public void dataChanged(){
        notifyObservers();
    }
}