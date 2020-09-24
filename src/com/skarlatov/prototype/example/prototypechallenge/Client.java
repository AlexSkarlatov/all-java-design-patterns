package com.skarlatov.prototype.example.prototypechallenge;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("prototype pattern demo ***");

        BasicCarCache.loadCache();

        BasicCar bc1 = (BasicCar) BasicCarCache.getCar("GREEN_NANO");
        bc1.price = bc1.price + BasicCar.setPrice();
        System.out.println("car is : " + bc1.getModelName() + " and its price is " + bc1.getPrice() );


        bc1 = (BasicCar) BasicCarCache.getCar("YELLOW_FORD");

        bc1.price = bc1.price + BasicCar.setPrice();
        System.out.println("Car is : " + bc1.modelName + " and its price is " + bc1.price);

    }


}
