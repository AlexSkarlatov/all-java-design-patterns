package com.skarlatov.memento_pattern.challenge;

public class Client {
    public static void main(String... args){
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();



        originator.setState("state 1");
        originator.setState("state 2");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("state 3");

        caretaker.add(originator.saveStateToMemento()) ;
        originator.setState("state 4");
        System.out.println("Current state:  " + originator.getState());
        //hte only thing that is allowed to create a memento is the originator itself
    }

}
