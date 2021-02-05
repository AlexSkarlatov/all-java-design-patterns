package com.skarlatov.VisitorPattern.visitorChallenge;


//must have a visit method for each item element object
public interface Visitor {
    public void visit(Book book);
    public void visit(DVD dvd);
    public void visit(CD cd);

    public double getTotalPostage();
}


class LocalStoreOperations implements Visitor {
    @Override
    public double getTotalPostage() {
        return 0;
    }

    @Override
    public void visit(Book book) {

    }

    @Override
    public void visit(DVD dvd) {

    }

    @Override
    public void visit(CD cd) {

    }
}
class USPostageVisitor implements Visitor {
    @Override
    public double getTotalPostage() {
        return totalPostageForCart;
    }

    public double getTotalPostageForCart() {
        return totalPostageForCart;
    }

    private double totalPostageForCart = 0;

    //collect data bout the book
    //if book less than 20 then add postage cost, if greater , then trhere will be no postage cose
    @Override
    public void visit(Book book) {
        //calculations for the book go here
        //assume calculation related to weight and price according to business requirements
        if(book.getPrice() < 20){
            totalPostageForCart += book.getWeight()* 2.5;
        }
    }
    @Override
    public void visit(DVD dvd) {
        if(dvd.getPrice()<20){
            totalPostageForCart += dvd.getPrice() * 3;
        }
    }

    @Override
    public void visit(CD cd) {
        if(cd.getPrice()<20){
            totalPostageForCart += cd.getPrice() * 4.3;
        }
    }
}
class SouthAmericaPostageOperations implements Visitor {
    @Override
    public double getTotalPostage() {
        return getTotalPostageForCart();
    }

    public double getTotalPostageForCart() {
        return totalPostageForCart;
    }

    private double totalPostageForCart = 0;

    @Override
    public void visit(Book book) {
        if(book.getPrice()<30){
            totalPostageForCart += (book.getPrice() *2) *2;
        }

    }

    @Override
    public void visit(DVD dvd) {
        if(dvd.getPrice()<30){
            totalPostageForCart += (dvd.getPrice() *3) *2;
        }
    }

    @Override
    public void visit(CD cd) {
        if(cd.getPrice()<30){
            totalPostageForCart += (cd.getPrice() *4) *2;
        }


    }
}