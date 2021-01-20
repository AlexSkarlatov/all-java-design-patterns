package com.skarlatov.VisitorPattern.visitorChallenge;

import java.util.ArrayList;

public class Client {

    private static ArrayList<Visitable> items = new ArrayList<>();

    public static void main(String[] args){

        //all needed is create some visitable itedms
        Visitable myuBook = new Book(8.44, 1.054);
        Visitable CD = new CD(11.33, 1.40);
        Visitable Dvd = new DVD(34.22, 8.34);

        items.add(myuBook);
        items.add(CD);
        items.add(Dvd);

        Visitor visitor = new USPostageVisitor();

        double totalPostage = calculatePostage(visitor);

        double southAmericanPostage = calculatePostage(new SouthAmericaPostageOperations());
        System.out.println(" american internal postage == " + totalPostage);
        System.out.println(" south american external postage == " + southAmericanPostage);


    }

    public static double calculatePostage(Visitor visitor){
        for(Visitable visitable : items){
            visitable.accept(visitor);
        }
        double totalPostage = visitor.getTotalPostage();
        return totalPostage;
    }
}
