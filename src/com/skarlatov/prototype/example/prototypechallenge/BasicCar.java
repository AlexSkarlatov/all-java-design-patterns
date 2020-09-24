package com.skarlatov.prototype.example.prototypechallenge;

import java.util.Random;

public class BasicCar implements Cloneable {
    public String modelName;
    public int price;

    public int getPrice() {
        return price;
    }

    public static int setPrice() {
//        this.price = price;
        Random r = new Random();
        int price = 0;
        int p = r.nextInt(100000);
        price  = p;
        return price;
    }

    public String getModelName(){
        return  this.modelName;
    }
    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public BasicCar clone()  throws CloneNotSupportedException{
        return (BasicCar) super.clone();
    }
}



class Ford extends BasicCar implements Cloneable{
    public Ford(String m){
        modelName = m;
    }
    @Override
    public BasicCar clone()  throws CloneNotSupportedException{
        return (Ford)super.clone();
    }
}



class Nano extends BasicCar implements Cloneable {
    public Nano(String m){
        modelName = m;
    }
    @Override
    public BasicCar clone()  throws CloneNotSupportedException{
        return (Nano)super.clone();
    }
}