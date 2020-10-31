package com.skarlatov.flyweight;


import java.io.OutputStream;
import java.util.Random;

/*
a client maintians a reference to the flyweight pool
and also computes and stores all extrinsic data
 */
public class Client {
    static String getRandomColor() {
        Random r = new Random();
        int randomInt = r.nextInt(20);
        if (randomInt % 2 == 0) {
            return "orange";
        } else {
            return "green";

        }
    }
    public static void main(String[] args) throws Exception
    {
        RobotFactory myFactory = new RobotFactory();
        System.out.println("\n*** Flyweight pattern example\n\n\n\n a client maintains");
        RobotInterface instance = (Robot)myFactory.getRobotFromFactory("KING");
        Robot shape;

        /*
        here we try to make several robot type kings
         */
        for( int i = 0 ; i < 3 ; i++){
            shape = (Robot) myFactory.getRobotFromFactory("KING");
            shape.setColor(getRandomColor());
            shape.print();
        }


        for( int i = 0 ; i < 3 ; i++){
            shape = (Robot) myFactory.getRobotFromFactory("QUEEN");
            shape.setColor(getRandomColor());
            shape.print();
        }

        int numOfDistinctRobots = myFactory.totalObjectsCreated();
        System.out.println("\n\n finally this is no of distinct objects created:   "
                + numOfDistinctRobots);
//        RobotInterface mRobot = (MediumRobot)myFactory.getRobotFromFactory("MEDIUM");
//        mRobot.print();
//
//        /*
//        RIGHT HEERE WE ARE MAKING 'new' ojbectes from the flyweight pool
//        from now onwoards no additional robot objects are being created but are being return
//        but are being returned from het hash map and modified after the fac with extrinsic data
//         */
//        for(int i = 0 ; i < 2; i++){
//            mRobot = (MediumRobot)myFactory.getRobotFromFactory("MEDIUM");
//            mRobot.print();
//        }
//        int numOfDistinctRobots = myFactory.totalObjectsCreated();
//        System.out.println("\n\n distince tobot objects created" + numOfDistinctRobots);
//        RobotInterface lRobot;
////        RobotInterface lRobot = myFactory.getRobotFromFactory("LARGE");
//        for ( int i = 0; i < 5 ; i++) {
//            lRobot = (LargeRobot)myFactory.getRobotFromFactory("LARGE");
//            lRobot.print();
//        }
//
//        int numOfDistinctRobots = myFactory.totalObjectsCreated();
//        System.out.println("\n\n finally this is no of distinct objects created" +
//                " tobot objects created:   " + numOfDistinctRobots);
    }

}
