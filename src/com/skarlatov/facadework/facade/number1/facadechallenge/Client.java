package com.skarlatov.facadework.facade.number1.facadechallenge;

public class Client {

    public static void main(String[] args){
        HotelKeeperFacade hotelKeeperBob = new HotelKeeperFacade();
        VegMenu vegMenu = hotelKeeperBob.getVegMenu();
        vegMenu.showMenu();

        OutbackSteakHouseMenu steaksMenu = hotelKeeperBob.getOutbackSteakhouseMenu();
        steaksMenu.showMenu();
    }


}
