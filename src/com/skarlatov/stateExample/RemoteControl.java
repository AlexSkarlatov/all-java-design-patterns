package com.skarlatov.stateExample;


/*
abstract class is for default behavior in all instances of the state machine or perhaps any finals variable seneed to be declared

 */
public abstract class RemoteControl {
    public abstract void pressSwitch(TV context);
}

class On extends RemoteControl{
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already On. Goning to be off now");
        context.setState(new Off());
    }
}

class Off extends RemoteControl{
    @Override
    public void pressSwitch(TV context) {
        System.out.println("I am already Off. Going to be On now");
        context.setState(new On());
    }
}




/*

public class RemoteControl {
    public String state;


    public void setState(String state){
        this.state = state;

    }
    public void doAction(){
        if(state.equalsIgnoreCase("ON")){
            System.out.println("Tv is turned ON");
        }
        else {
            System.out.println("Tv is turned off");
        }
    }

    public static void main(String[] args){
        RemoteControl remoteBasic = new RemoteControl();

        remoteBasic.setState("on");
        remoteBasic.doAction();

        remoteBasic.setState("off");
        remoteBasic.doAction();

    }

}

 */