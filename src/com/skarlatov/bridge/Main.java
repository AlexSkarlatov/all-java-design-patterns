package com.skarlatov.bridge;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Vehicle v1 = new Car(new Produce(),new Assemble());
        v1.manufacture();


        Vehicle v2 = new Bike(new Produce(),new Assemble());
        v2.manufacture();
    }
}