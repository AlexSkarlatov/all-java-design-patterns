package com.skarlatov.flyweight;


import java.io.OutputStream;

/*
a client maintians a reference to the flyweight pool
and also computes and stores all extrinsic data
 */
public class Client {
    public static void main(String[] args) throws Exception
    {
        RobotFactory myFactory = new RobotFactory();
        System.out.println("\n*** Flyweight pattern example\n\n\n\n a client maintains");

        RobotInterface mRobot = (MediumRobot)myFactory.getRobotFromFactory("MEDIUM");
        mRobot.print();

        /*
        RIGHT HEERE WE ARE MAKING 'new' ojbectes from the flyweight pool
        from now onwoards no additional robot objects are being created but are being return
        but are being returned from het hash map and modified after the fac with extrinsic data
         */
        for(int i = 0 ; i < 2; i++){
            mRobot = (MediumRobot)myFactory.getRobotFromFactory("MEDIUM");
            mRobot.print();
        }
        int numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("\n\n distince tobot objects created" + numOfDistinctRobots);
        RobotInterface lRobot;
//        RobotInterface lRobot = myFactory.getRobotFromFactory("LARGE");
        for ( int i = 0; i < 5 ; i++) {
            lRobot = (LargeRobot)myFactory.getRobotFromFactory("LARGE");
            lRobot.print();
        }

        numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("\n\n finally this is no of distinct objects created" +
                " tobot objects created:   " + numOfDistinctRobots);
    }

}
