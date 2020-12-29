package com.skarlatov.iterators.Challenge;

public class Arts implements SubjectInterface{

    private String[] subjects;

    public Arts(){
        //default collection content
        //add to list
        subjects = new String[2];
        subjects[0] = "painting";
        subjects[1] = "sculpting";
    }

    @Override
    public IteratorInterface createIterator() {
        return new ArtsIterator(subjects);
    }
}
