package com.skarlatov.StrategyPattern;
import java.lang.*;
public class Client {

    public static void main(String[] args){
        ShoppingCart shoppingCart = new ShoppingCart();//the context
        String s = "";

        Item item1 = new Item("1234", 10);
        Item item2 = new Item("5678" , 1111);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        //pay using paypal strategy
        shoppingCart.pay(new PaypalStrategy("John 117", "117halo"));
        //pay using credit card strategy
        shoppingCart.pay(new CreditCardStrategy("Cortana","6481039841235","432","12/20"));
    }
}
