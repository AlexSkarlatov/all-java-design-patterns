package com.skarlatov.bridge;

abstract class Vehicle {
    //has a relationship to implementeror
    //has a workshop
    protected Workshop workshop1;
    protected Workshop workshop2;

    protected Vehicle(Workshop w1, Workshop w2){
        this.workshop1 = w1;
        this.workshop2 = w2;
    }
    abstract public void manufacture();
}


//=====================================================
class Car extends Vehicle {
    public Car(Workshop w1, Workshop w2){
        super(w1, w2);
    }

    @Override
    public void manufacture() {
        System.out.println("the car is " );
        workshop1.work();
        workshop2.work();
    }
}


class Bike extends Vehicle {
    public Bike(Workshop w1, Workshop w2){
        super(w1, w2);
    }

    @Override
    public void manufacture() {
        System.out.println("the bike is " );
        workshop1.work();
        workshop2.work();
    }
}
