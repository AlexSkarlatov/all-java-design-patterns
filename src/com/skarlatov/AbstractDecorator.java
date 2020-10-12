package com.skarlatov;

public class AbstractDecorator extends Component {

    protected Component com;
    public void setTheComponent(Component c){
        com = c;
    }


    @Override
    public void doJob() {
        if(com != null){
            com.doJob();
        }
    }
}


class ConcreteDecorator_1 extends AbstractDecorator{
    @Override
    public void doJob() {
        super.doJob();

        //additional repsonsibilities are put here
        System.out.println("I am explicitly from decorator 1");
    }
}


class ConcreteDecorator_2 extends AbstractDecorator{
    @Override
    public void doJob() {
        //
        System.out.println("work done before super.do job");
        super.doJob();

        //additional repsonsibilities are put here
        System.out.println("I am explicitly from decorator 2");
    }
}

class AddSprinkles extends AbstractDecorator{
    @Override
    public void doJob() {
        System.out.println("***SGTAART SPRINKLES***");
        super.doJob();

        //additional repsonsibilities are put here
        System.out.println("adding sprinkles to cupcake");
    }
}