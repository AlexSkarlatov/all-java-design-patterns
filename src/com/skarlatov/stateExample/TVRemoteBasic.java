package com.skarlatov.stateExample;

public class TVRemoteBasic {
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
        TVRemoteBasic remoteBasic = new TVRemoteBasic();

        remoteBasic.setState("on");
        remoteBasic.doAction();

        remoteBasic.setState("off");
        remoteBasic.doAction();

    }

}
