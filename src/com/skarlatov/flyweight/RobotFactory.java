package com.skarlatov.flyweight;


import java.util.HashMap;
import java.util.Map;

/*
will create and manage all instances of flyweight objectscts
 */
public class RobotFactory {
    Map<String, RobotInterface> robotsMap = new HashMap<String, RobotInterface>();

    public int totalObjectsCreated(){
        return robotsMap.size();
    }

    public RobotInterface getRobotFromFactory(String robotCategory) throws Exception {
        RobotInterface myRobot = null;
        if ( robotsMap.containsKey(robotCategory))
        {
            myRobot = robotsMap.get(robotCategory);
        }


        else
            {
            switch (robotCategory)
            {
                case "SMALL":
                    System.out.println("We do not have a Small Robot. so we are creating a small Robot");
                    myRobot = new SmallRobot();
                    robotsMap.put("SMALL", myRobot);
                    break;
                case "MEDIUM":
                    System.out.println("We do not have a Medium Robot. so we are creating a medium Robot");
                    myRobot = new MediumRobot();
                    robotsMap.put("MEDIUM", myRobot);
                    break;
                case "LARGE":
                    System.out.println("We do not have a Large Robot. so we are creating a large Robot");
                    myRobot = new LargeRobot();
                    robotsMap.put("LARGE", myRobot);
                    break;
                default:
                    throw new Exception("Robot factory can only create small medium and large type robots");
            }
        }
        return myRobot;
    }
}
