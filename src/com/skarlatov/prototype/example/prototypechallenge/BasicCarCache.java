package com.skarlatov.prototype.example.prototypechallenge;

import java.util.Hashtable;

public class BasicCarCache {
    public static Hashtable<String, BasicCar> basicCarMap = new Hashtable<String,BasicCar>();


    public static BasicCar getCar(String key) throws CloneNotSupportedException{
        BasicCar cachedBasicCar = basicCarMap.get(key);
        return (BasicCar) cachedBasicCar.clone();
    }

    public static void loadCache() throws CloneNotSupportedException{
        BasicCar nano_base = new Nano("Green Nano");
        nano_base.price=10000;
        basicCarMap.put("GREEN_NANO", nano_base);

        BasicCar ford_base = new Ford("Yellow Ford");
        nano_base.price=50000;
        basicCarMap.put("YELLOW_FORD", ford_base);
    }
}
