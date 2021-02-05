package com.skarlatov.adapter;

public class Main {

    public static void main(String[] args) {
        // write your code here
        SpaceDuck sd = new SpaceDuck();
        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyAdapter2Duck = new TurkeyAdapter2Duck(wildTurkey);




        System.out.println("The turkey says ....");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe space Duck says ....");
        testDuck(sd);

        System.out.println("\nThe TurkeyAdapter says ....");
        testDuck(turkeyAdapter2Duck);
    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}