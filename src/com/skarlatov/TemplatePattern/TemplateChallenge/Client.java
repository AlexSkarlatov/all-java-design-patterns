package com.skarlatov.TemplatePattern.TemplateChallenge;

public class Client {
    public static void main(String[] args){
        OrderTemplate orderTemplate = new NetOrder();

        OrderTemplate netOrder = new NetOrder();

        netOrder.processOrder(true);

        System.out.println("----- changin the tempalte to a store order");

        OrderTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder(false);
    }
}
