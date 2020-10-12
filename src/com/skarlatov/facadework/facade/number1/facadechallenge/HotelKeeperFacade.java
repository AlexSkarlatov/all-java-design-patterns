package com.skarlatov.facadework.facade.number1.facadechallenge;

public class HotelKeeperFacade {

    public HotelKeeperFacade(){

    }
    public VegMenu getVegMenu(){
        VegRestaurant v = new VegRestaurant();
        VegMenu vm = (VegMenu) v.getMenus();
//        return new VegMenu();
        return vm;
    }
    public OutbackSteakHouseMenu getOutbackSteakhouseMenu(){
        OutbackSteakHouseRestaraunt steakHouseRestaraunt = new OutbackSteakHouseRestaraunt();
        OutbackSteakHouseMenu menu = (OutbackSteakHouseMenu)steakHouseRestaraunt.getMenus();
//        return new OutbackSteakHouseMenu();
        return menu;
    }
    public Both getOmnivoreMenu(){
        //new instance of restaurant
        VegNonBothRestaurant vegNonBothRestaurant = new VegNonBothRestaurant();
        Both b = (Both) vegNonBothRestaurant.getMenus();
        return b;
    }
    public NonVegMenu getCarnivoreMenu(){
        return new NonVegMenu();
    }


}
