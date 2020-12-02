package com.skarlatov.memento_pattern.challenge;


//memnto class does not have to be an inner class
public class Memento {
    private String state;
    public Memento(String state){
        this.state = state;
    }

    public String getState()
    {
        return state;
    }
}
