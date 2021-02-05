package com.skarlatov.StrategyPattern;

public class Item {
    private String upcCode;
    private int price;

    public Item(String upcCode, int price){
        this.price = price;
        this.upcCode = upcCode;

    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

}


