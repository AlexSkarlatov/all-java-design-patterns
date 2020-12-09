package com.skarlatov.memento_pattern.challengeAttempt.civGameSaveFunction;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class CivilizationBECity {
    ArrayList<String> tiles;
    ArrayList<String> districts;
    String description, name;
    public CivilizationBECity(){
        //default instantiation protocols
    }
    public CivilizationBECity(String name){
        this.name = name;
    }
    public CivilizationBECity(ArrayList<String> tiles, ArrayList<String> districts, String description) {
        this.tiles = tiles;
        this.districts = districts;
        this.description = description;
    }


}
