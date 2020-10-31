package com.skarlatov.flyweight;


//flyweight interface
// descendants are the flyweight objectcst with intrinsic data
public interface RobotInterface {
    void print();
//    void setColor(String colorOfRobot);
}


class SmallRobot implements RobotInterface {
    @Override
    public void print() {
        System.out.println("this is a small robot");
    }
}


class MediumRobot implements RobotInterface {
    @Override
    public void print() {
        System.out.println("this is a Medium robot");
    }
}
class LargeRobot implements RobotInterface {
    @Override
    public void print() {
        System.out.println("this is a Large robot");
    }
}