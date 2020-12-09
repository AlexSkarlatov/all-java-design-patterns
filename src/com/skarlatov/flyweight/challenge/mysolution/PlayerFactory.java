package com.skarlatov.flyweight.challenge.mysolution;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

    //fields
    //maintains intrinsic state of flyweights
    Map<String, Soldier> soldiersHashMap = new HashMap<>();

    public int getTotalObjects(){
        return soldiersHashMap.size();
    }

    public Soldier getPlayer(String playerType) throws Exception{
        String sanitizedPlayerType = playerType.toUpperCase();
        Soldier playerObject = null;
        if(soldiersHashMap.containsKey(sanitizedPlayerType)){
            playerObject = soldiersHashMap.get(sanitizedPlayerType);
        }
        else {
            switch (sanitizedPlayerType){
                case "CT":
                    System.out.println("spawning initial counter terrorist flyweight");
                    playerObject = new CounterTerrorist();
                    soldiersHashMap.put("CT", playerObject);
//                    return playerObject;
                    break;
                case "T":
                    System.out.println("spawning initial terrorist flyweight");
                    playerObject = new Terrorist();
                    soldiersHashMap.put("T", playerObject);
                    break;
                default:
                    throw new Exception("message about the game");
//                    break;
            }
        }
        return playerObject;
    }
}
