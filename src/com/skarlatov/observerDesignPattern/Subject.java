package com.skarlatov.observerDesignPattern;
//import java.uti            l.Observer;

import java.util.ArrayList;
import java.util.List;

public interface Subject {
/*
the subject must know its observers so it amy notofity said observers of any change
 */

    //methods to register and unregister observers
    public void register(Observer obj );
    public void unregister(Observer obj);

    //method to notify observers of changes
    public void notifyObservers();

    //method to get updates fromthe subject, not required but added so abservers may query the subject at some point that they like
    public Object getUpdate(Observer obj);

}



class MyTopic implements Subject{

    //state for the topic to maintain and notify
    private List<Observer> observers;
    private String message;
    private boolean changed;


    public MyTopic(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if(obj == null) throw new NullPointerException("Null Observer");
        if(!observers.contains(obj)) observers.add(obj); // add observer object to the stateful lsit
    }

    @Override
    public void unregister(Observer obj) {
        observers.remove(obj);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observerLocal = null;

        if(!changed) return;

        observerLocal = new ArrayList<>(this.observers);
        changed = false;

        for(Observer o : observerLocal){
            o.update();
            //TODO IMPLEMENT THE LOGIC FOR THE THE OBSERVER.uPDATE() METHOD
        }
    }

    //returns a change in state, is meant to be used by the observer
    @Override
    public Object getUpdate(Observer obj) {
        //return state back to observer
        return this.message;
    }


    public void postMessage(String msg){
        System.out.println("Message Posted to topic:  "  + msg);
        this.message = msg;
        this.changed = true;
        notifyObservers();
    }
}