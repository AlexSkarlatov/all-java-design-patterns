package com.skarlatov.stateExample.challenge;

public class Client {
    public static void main(String[] args){
        AlertStateContext stateContext = new AlertStateContext();

        stateContext.alert();
        stateContext.alert();

        stateContext.setState(new SilentState());

        stateContext.alert();
        stateContext.alert();
        stateContext.alert();

        stateContext.setState(new SoundState());
        stateContext.alert();
    }
}
