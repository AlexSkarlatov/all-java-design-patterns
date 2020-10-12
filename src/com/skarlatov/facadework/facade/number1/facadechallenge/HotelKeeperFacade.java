package com.skarlatov.facadework.facade.number1.facadechallenge;

public class HotelKeeperFacade {

    public HotelKeeperFacade(){

    }
    public VegMenu getVegMenu(){
        return new VegMenu();
    }
    public OutbackSteakHouseMenu getOutbackSteakhouseMenu(){
        return new OutbackSteakHouseMenu();
    }
    public Both getOmnivoreMenu(){
        return new Both();
    }
    public NonVegMenu getCarnivoreMenu(){
        return new NonVegMenu();
    }


}
