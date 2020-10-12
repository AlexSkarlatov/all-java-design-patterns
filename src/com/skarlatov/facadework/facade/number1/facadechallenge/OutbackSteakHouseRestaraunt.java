package com.skarlatov.facadework.facade.number1.facadechallenge;

public class OutbackSteakHouseRestaraunt implements Hotel{
    @Override
    public Menus getMenus() {
        return new OutbackSteakHouseMenu();
    }
}
