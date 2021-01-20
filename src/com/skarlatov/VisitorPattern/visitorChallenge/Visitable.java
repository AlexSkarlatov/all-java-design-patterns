package com.skarlatov.VisitorPattern.visitorChallenge;

public interface Visitable {
    public void accept(Visitor visitor);
}

class Book implements Visitable {
    private double price;
    private double weight;

    public Book(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class CD implements Visitable{
    private double weight, price;


    public CD(double weight, double price) {
        this.weight = weight;
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

// do loook similare but if needed they can be vedry diffewrent
class DVD implements Visitable {

    private double price, weight;


    public DVD(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }




    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}