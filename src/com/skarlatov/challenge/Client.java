package com.skarlatov.challenge;

import org.w3c.dom.css.Rect;

public class Client {
    public static void main(String[] args){
        ShapeI circle = new Circle();

        ShapeI redCircle = new RedShapeDecorator(new Circle());
        ShapeI redRectangle = new RedShapeDecorator(new Rectangle());

        //circle with normal d border
        circle.draw();

        // circle with red border
        redCircle.draw();

//        circle with red border
        redRectangle.draw();


        ShapeI specialShape = new RedShapeDecorator(new TransparencyFill(new ThickBorder(new Circle()), 11));
        specialShape.draw();

    }
}
