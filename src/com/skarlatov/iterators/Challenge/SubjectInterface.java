package com.skarlatov.iterators.Challenge;

import java.util.LinkedList;
import java.util.Scanner;

public interface SubjectInterface {
    public IteratorInterface createIterator();

}


//
//class Arts implements SubjectInterface {
//
//   private String[] subjects;
//
//    public Arts(){
//
//    }
//}



//science aggregate or
//science data structure
class Science implements SubjectInterface {
    private LinkedList<String> subjects;
    public Science(){
        subjects = new LinkedList<>();
        subjects.add("Math");
        subjects.add("Comp. SC");
        subjects.add("PHysics");

    }

    @Override
    public IteratorInterface createIterator() {
        return new ScienceIterator(subjects);
    }
}