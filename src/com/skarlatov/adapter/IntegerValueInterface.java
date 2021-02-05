package com.skarlatov.adapter;

public interface IntegerValueInterface {
    public int getInteger();
}


class IntegerValue implements IntegerValueInterface{

    @Override
    public int getInteger() {
        return 5;
    }
}


class ClassAdapter extends IntegerValue{
    @Override
    public int getInteger() {
        return 2 +  super.getInteger();
    }
}

class ObjectAdapter {
    private IntegerValueInterface adaptee;
    public ObjectAdapter(IntegerValueInterface adaptee){
        this.adaptee = adaptee;
    }
    public int getInteger(){
        return  2 + this.adaptee.getInteger();
    }
}