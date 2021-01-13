package com.skarlatov.StrategyPattern;

import java.util.ArrayList;
import java.util.List;

/*
this is the context class
the whole puprose of the context class is to forward requests fro the client to the algorithm strategy classes

 */
public class ShoppingCart {
    List<Item> itemList ;
    public ShoppingCart(){
        itemList = new ArrayList<>();

    }
    public void addItem(Item i ) {
        this.itemList.add(i);

    }
    public void removeItem(Item i ) {
        this.itemList.remove(i);

    }
    public int calculateTotal(){
        int sum = 0;
        for(Item i: itemList){
            sum += i.getPrice();
        }
        return sum;
    }
    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}
