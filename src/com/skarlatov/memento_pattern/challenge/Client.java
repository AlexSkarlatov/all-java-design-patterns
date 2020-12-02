package com.skarlatov.memento_pattern.challenge;

public class Client {
    public static void main(String... args){
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();


        caretaker.add(originator.saveStateToMemento()) ;
    }

}