package com.skarlatov.iterators;


/*
defines a basic functions of the iterator over a collection
 */
public interface Iterator {

    //will tell if there are more elements to iter over
    boolean hasNext();

    //will return the next element
    Object next();


}


