package com.skarlatov.iterators.Challenge;


import java.util.LinkedList;

//contain traversal methods
public interface IteratorInterface {
    //return pointer to first position
    void first();

    //get next element also move forward one space
    String next();

    //pointer has reached the end of the collection
    boolean isDone();

    //return current item
    String currentItem();

}


class ArtsIterator implements IteratorInterface{
    private String[] subjects;
    private int position;

    public ArtsIterator(String[] subjects){
        this.subjects = subjects;
        position = 0;
    }
    /*
    returns the current subject intdex value and then increments the postion
     */
    @Override
    public String next() {
        return subjects[position++];
    }

    @Override
    public boolean isDone() {
        return position >= subjects.length;
    }

    @Override
    public String currentItem() {
        return subjects[position];
    }

    @Override
    public void first(){
        position = 0;
    }
}


class ScienceIterator implements  IteratorInterface{

    private LinkedList<String> subjects;
    private int position;

    public ScienceIterator (LinkedList<String> subjects) {
        this.subjects = subjects;
        position = 0;

    }

    @Override
    public String next() {
        return subjects.get(position++);
//        return subjects[position++];
    }

    @Override
    public boolean isDone() {
        return position >= subjects.size();
    }

    @Override
    public String currentItem() {
        return subjects.get(position);
    }

    @Override
    public void first(){
        position = 0;
    }
}