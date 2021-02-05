package com.skarlatov.bridge;

public abstract class Workshop {
    abstract public void work();
}
class Produce extends Workshop {
    @Override
    public void work() {
        System.out.println("Produced");
    }
}
class Assemble extends Workshop {
    @Override
    public void work() {
        System.out.println("and Assembled");

//        System.out.println("Produced");
    }
}