package com.skarlatov.VisitorPattern.VisitorExample;

public interface ShoppingCartVisitor {
    int visit(Book b);
    int visit(Fruit f);
}
class ShoppingCartVisitorImpl implements ShoppingCartVisitor {


    @Override
    public int visit(Book b) {
        int cost = 0;
        // apply a 5 $ discouint if the book reaches above a certain price threshold of 50 dollars
        if(b.getPrice() > 50)
            cost = b.getPrice() - 5;
        else
            cost = b.getPrice();

        System.out.println("Book isbn::" + b.getIsbnNumber() + " cosat = " + cost);
        return cost;
    }

    @Override
    public int visit(Fruit f) {
        int cost = f.getPricePerKg() * f.getWeight();

        System.out.println(f.getName() + "cost = " + cost);
        return cost;
    }
}
