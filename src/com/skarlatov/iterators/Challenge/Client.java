package com.skarlatov.iterators.Challenge;

import com.skarlatov.iterators.Iterator;

public class Client {

    public static void print(IteratorInterface ii){
        while(!ii.isDone()){
            System.out.println(ii.next());
        }
    }
    public static void main(String[] args){


        System.out.println("***Iterator Pattern Demo***\n");
        SubjectInterface Sc_Subject = new Science();
        SubjectInterface Ar_subject = new Arts();

        IteratorInterface Sc_iterator = Sc_Subject.createIterator();
        IteratorInterface Ar_iterator = Ar_subject.createIterator();

        System.out.println("\nScience subjects : " ) ;
        print(Sc_iterator);


        System.out.println("\nARts subjects");
        print(Ar_iterator);
    }


}
