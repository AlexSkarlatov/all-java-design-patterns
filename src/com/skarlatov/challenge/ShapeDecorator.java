package com.skarlatov.challenge;

abstract class ShapeDecorator implements ShapeI {
    protected ShapeI decoratedShape;
    public ShapeDecorator(ShapeI decoratedShape){
        this.decoratedShape = decoratedShape;
    }
//    @Override
    public void draw(){
        decoratedShape.draw();
//        System.out.println("added behaviors");
    }
}


class RedShapeDecorator extends  ShapeDecorator {
    public RedShapeDecorator(ShapeI decoratedShape){
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        //added behaviors
        setRedBorder(decoratedShape);
    }
    private void setRedBorder(ShapeI decoratedShape){

        System.out.println("Border Color: Red");
    }
}

class ThickBorder extends ShapeDecorator {
    public  ThickBorder(ShapeI ds){
        super(ds);
    }

    @Override
    public void draw() {
        super.draw();
        decoratedShape.draw();
        setThickBorder(decoratedShape);
    }
    private void setThickBorder(ShapeI decoratedShape){
        System.out.println("Border thickness: 10");
    }
}

class ThinBorder extends ShapeDecorator {
    public  ThinBorder(ShapeI shapeDecorator){
        super(shapeDecorator);
    }

    @Override
    public void draw() {
        super.draw();

        setThinBorder(this.decoratedShape);
    }
    private void setThinBorder(ShapeI ds){
        System.out.println("borderThickness == thin");
    }
}
//==============================================
class TransparencyFill extends ShapeDecorator{
    //new behavior new member fields to take care of
    int transparency = 0;
    public TransparencyFill(ShapeI ds, int transparency){
        super(ds);
        this.transparency = transparency;
    }

    @Override
    public void draw() {
        super.draw();
        describeSelf();

    }
    private void describeSelf(){
        System.out.println("object transparency level ==" + this.transparency);
    }
}