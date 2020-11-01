package com.skarlatov.flyweight.challenge.mysolution;

public class CounterTerrorist implements Soldier {



    //add fields
    //the weapon is extrinsic and thus computed by the  client
    String weapon = StartGame.assignRandomWeapon();
//    the msision is intrinsic to all objects that share this reference
    String mission = "diffuese the bomb";


    //add Constructor
    CounterTerrorist(){
        System.out.println("a CounterTerrorist has been spawned on the map");
    }
//    CounterTerrorist(String weapon , String mission){
//        this.weapon = weapon;
//        this.mission = mission;
//    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public void print() {
        System.out.println("the counter-terrorist is armed with a " + weapon +"  ||   his mission is to "+ mission);
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
