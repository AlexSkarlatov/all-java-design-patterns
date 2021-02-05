package com.skarlatov.VisitorPattern.VisitorExample;

public interface ItemElement {

    public int accept(ShoppingCartVisitor visitor);

}


class Book implements ItemElement{
    private int price;
    private String isbnNumber;
    public Book(int cost, String isbnNumber){
        this.price = cost;
        this.isbnNumber = isbnNumber;


    }

    public int getPrice(){
        return price;

    }
    public String getIsbnNumber(){
        return isbnNumber;

    }

    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}

class Fruit implements ItemElement{
    private int pricePerKg, weight;

    public int getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(int pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Fruit(int pricePerKg, int weight, String name) {
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.name = name;
    }

//    public Fruit(){
//
//    }



    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }
}