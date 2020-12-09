package com.skarlatov.flyweight.challenge.mysolution;

import java.util.Random;

public class StartGame {
    static String assignRandomWeapon() {
        Random r = new Random();
        int randomInt = r.nextInt(300);
        if (randomInt % 3 == 0) {
            return "big knife";
        } else if(randomInt % 2 == 0){
            return "big gun";
        }
        else {
            return "spartan laser";
        }
    }
    static String assignRandomMission() {
        Random r = new Random();
        int randomInt = r.nextInt(20);
        if (randomInt % 2 == 0) {
            return "capture point alpha ";
        } else {
            return "diffuse the bomb";
        }
    }
    public static void main(String[] args) throws Exception{
            //create factory
            PlayerFactory playerFactory = new PlayerFactory();
            //create instances from factory and store in reference variable of type interface
            Soldier terrorist, counterTerrorist;
            Terrorist t;
            CounterTerrorist ct;
            t =(Terrorist) playerFactory.getPlayer("t");
            terrorist = playerFactory.getPlayer("t");



            for( int i = 0 ; i < 5 ; i++){
                terrorist = playerFactory.getPlayer("t");
//                terrorist.assignMission(assignRandomMission());
                terrorist.assignWeapon(assignRandomWeapon());
                terrorist.print();
            }
            for( int i = 0 ; i < 5 ; i++){
                counterTerrorist = playerFactory.getPlayer("ct");
                counterTerrorist.assignWeapon(assignRandomWeapon());
//                counterTerrorist.assignMission(assignRandomMission());
                counterTerrorist.print();
            }

        }
}
