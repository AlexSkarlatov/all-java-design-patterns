package com.skarlatov.stateExample;
/*
this is the context class
it defines the interface of interest to the clients
its alos keep a refernec of its current state and to the next implenetation

 */
public class TV {

    private RemoteControl state;

    public TV(RemoteControl state){
        this.state = state;
    }
    public RemoteControl getState() {
        return state;
        //return state.toString();
    }
    public void setState(RemoteControl state) {
        this.state = state;
    }
    //do something when button is pressed
    public void pressButton(){
        // state will point to a areference of on or off at all times
        state.pressSwitch(this);
    }
}
