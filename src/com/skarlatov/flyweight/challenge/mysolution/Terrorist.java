package com.skarlatov.flyweight.challenge.mysolution;

public class Terrorist implements Soldier {
    //add fields
    //this is an extrinsic data member
    String weapon;
    //this is intrinsic to all terrorist objects
    String mission = "plant bomb";

    //add Constructor
    Terrorist(){
        System.out.println("a terrorist has been spawned on the map");
    }


    @Override
    public void print() {
        System.out.println("the terrorist is armed with a " + weapon +"  ||   his mission is to "+ mission);
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

//    @Override
//    public void assignMission(String mission) {
//        this.mission = mission;
//    }
}
