package com.skarlatov.challenge;

interface ShapeI {
    void draw();
}



class Rectangle implements ShapeI {

    @Override
    public void draw() {
        System.out.println("Shape :: Rectangle");
    }
}


class Circle implements ShapeI {

    @Override
    public void draw() {
        System.out.println("Shape :: Circle");
    }
}