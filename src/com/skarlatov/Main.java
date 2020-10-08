package com.skarlatov;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("decorator is starting");
        ConcreteComponent cc = new ConcreteComponent();
        ConcreteDecorator_1 cd1 = new ConcreteDecorator_1();

        //this is now decorating cou conc compoenent with ca decorator
        cd1.setTheComponent(cc);
        cd1.doJob();


        ConcreteDecorator_2 cd2 = new ConcreteDecorator_2();
        cd2.setTheComponent(cd1);
        cd2.doJob();
    }
}
