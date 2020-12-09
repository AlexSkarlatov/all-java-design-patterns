package com.skarlatov.memento_pattern.challenge;

public class Client {
    public static void main(String... args){
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
// I cans see that this is a different layout of the caretaker to originator architecture that utilizes the communication to the memento pattern a little differently than the first example
        //but quite frankly the first implementation is just more intuitive and cleaner communication wise


        originator.setState("state 1");
//        originator.setState("state 2");
        caretaker.add(originator.saveStateToMemento());
        originator.setState("state 3");//modify originator
        //change game
        //procdeed turn end turn


        caretaker.add(originator.saveStateToMemento()) ;
        originator.setState("state 4");
        System.out.println("Current state:  " + originator.getState());
        //hte only thing that is allowed to create a memento is the originator itself

        originator.getStateFromMemento(caretaker.get(0));
        System.out.println("first saved state:  " + originator.getState());

        // final thoughts and notes as of 12/9/2020
        // originator will request a memento from the caretaker who only manages the mementos
        // a caretaker does not create meementos
        // a client does not need to store a reference to a memento rather the originator must handle the reference to thmemento and the caretaker also
        // but remember the originator is the only  one who is allowed to create a  memento.
        // the basic architecture is the same but there can be 2 variations in call implementations
        // slightly varied
        originator.getStateFromMemento(caretaker.get(1));
        System.out.println("second saved state:  " + originator.getState());


    }

}
