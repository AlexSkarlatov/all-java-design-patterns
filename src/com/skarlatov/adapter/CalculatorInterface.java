package com.skarlatov.adapter;



public interface CalculatorInterface {
    // target interface
    public double getArea(Rectangle r);

}



class Calculator implements CalculatorInterface{
    Rectangle r;
    @Override
    public double getArea(Rectangle r) {

        this.r = r;
        return r.length * r.width;

    }
}