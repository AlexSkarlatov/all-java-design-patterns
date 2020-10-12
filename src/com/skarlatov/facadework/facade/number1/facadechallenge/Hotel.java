package com.skarlatov.facadework.facade.number1.facadechallenge;
//naming convention is terrible hotel and restaruant has relationship but
//        do not do same functions in real world would be
//        better modeled by defining a restaruant interface and
//        a hotel interface that uses a raestaruant interface
public interface Hotel {
    public Menus getMenus();
    //bookGuest()
    //checkoutGuest()
    //Restaraunt getRestaraunt(String name);
}
interface Restaurant{
    public Menus getMenus();
    public void fulfillOrder();
    public void receiveOrder();
    /*
     I can see the the system is growing immensely complex as i attempt to model the subsystems reletaionship between chef restaraunt and hotel.
     a hotel keeper facade is what will help me mask the overarching complexity of returning a menu, receiving the order, fulfilling the order etc.
     */
}
class NonVegRestaurant implements Hotel
{
    public Menus getMenus()
    {
        NonVegMenu nv = new NonVegMenu();
        return nv;
    }
}

class VegRestaurant implements Hotel
{
    public Menus getMenus()
    {
        VegMenu v = new VegMenu();
        return v;
    }
}

class VegNonBothRestaurant implements Hotel
{
    public Menus getMenus()
    {
        Both b = new Both();
        return b;
    }
}



