package com.skarlatov.decorator;
//remember the compoentn defeines the interface for both decorator and basic behavior compnentt to follow
//
public abstract class Component {
    public abstract void doJob();

}


class ConcreteComponent extends Component{
    @Override
    public void doJob() {
        System.out.println("I am from a concrete component = I am closed for modification");

    }
}