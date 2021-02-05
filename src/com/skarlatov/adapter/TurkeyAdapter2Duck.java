package com.skarlatov.adapter;


//adapter implementts target interfface and contains adaptee
// instance to run conversion
public class TurkeyAdapter2Duck implements Duck{
    Turkey t;// instance of adaptee to be turned into duck behavior

    // all constructors must have the parameter take a value for its adaptee member value
    // to set it up
    public TurkeyAdapter2Duck(Turkey t ){
        this.t = t;
    }

    //adatpee behaves like duck in its won way
    public void quack(){
        t.gobble();
        //quack == retrieve sql data();
        //t.gobble = adaptee.getDatabaseQuery();
    }

    @Override
    public void fly() {
        for(int i = 0; i < 5 ; i++){
            t.fly();
        }
    }
}