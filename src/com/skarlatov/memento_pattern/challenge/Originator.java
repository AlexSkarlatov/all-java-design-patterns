package com.skarlatov.memento_pattern.challenge;



// the originator is the only one who has authorization to make a memento of itself
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;

    }
    public String getState(){
        return state;
    }

    public Memento saveStateToMemento(){
        return new Memento(state);
    }

    //essentially the restore method
    public void getStateFromMemento(Memento memento){
        state = memento.getState();
    }
}
