package com.skarlatov.flyweight;


//flyweight interface
// descendants are the flyweight objectcst with intrinsic data
public interface RobotInterface {
    void print();
    void setColor(String colorOfRobot);
}

class Robot implements RobotInterface {


    //fields
    String robotType, colorOfRobot;

    //constructor method
    public Robot(String robotType){
        this.robotType = robotType;
    }
    public Robot(String robotType, String robotColor){
        this.robotType = robotType;
        this.colorOfRobot = robotColor;
    }

    @Override
    public void print() {
        System.out.println("I am a "+ colorOfRobot + " Robot "
                + robotType);
    }

    @Override
    public void setColor(String colorOfRobot) {
        this.colorOfRobot = colorOfRobot;
    }
}



//class SmallRobot implements RobotInterface {
//    @Override
//    public void print() {
//        System.out.println("this is a small robot");
//    }
//}
//
//
//class MediumRobot implements RobotInterface {
//    @Override
//    public void print() {
//        System.out.println("this is a Medium robot");
//    }
//}
//class LargeRobot implements RobotInterface {
//    @Override
//    public void print() {
//        System.out.println("this is a Large robot");
//    }
//}