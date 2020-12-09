package com.skarlatov.memento_pattern.challenge;

import java.util.*;

public class Caretaker {

    private List<Memento> mementoList = new ArrayList<>();
// this implementation does not pass the originator but passes the memento and the index
    //it is not originator based but memento based
    public void add(Memento state){
        mementoList.add(state);

    }
    public Memento get(int index){
        return mementoList.get(index);
    }
}
