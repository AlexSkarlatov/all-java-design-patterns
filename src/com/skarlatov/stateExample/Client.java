package com.skarlatov.stateExample;

public class Client {
    public static void main(String[] args){
        System.out.println("demonstrationof the state pattern ");

        //inital state is set to off
        Off initialState = new Off();

//        Tv tv = new TV(initialState);
        TV tv = new TV(new Off());

        // first time press
        tv.pressButton();

        //second time press
        tv.pressButton();
        System.out.println(tv.getState());
        tv.getState();
    }





}
