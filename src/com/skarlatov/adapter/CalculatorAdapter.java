package com.skarlatov.adapter;



import org.w3c.dom.css.Rect;

public class CalculatorAdapter implements CalculatorInterface{
    Calculator calculator;
    Triangle t;// we need this attributes to adaptee it to target

    public CalculatorAdapter(Triangle thisTriangle){
        t = thisTriangle;

    }
    public void setTriangle(Triangle t){
        this.t = t;
    }
    public double getArea(Rectangle r){
        calculator = new Calculator();
        Rectangle re = new Rectangle();
        re.length = t.base;
        re.width = t.height * 0.5;
        // this is a really lame example
        return calculator.getArea(re);
    }



}