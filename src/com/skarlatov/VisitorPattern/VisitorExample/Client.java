package com.skarlatov.VisitorPattern.VisitorExample;

public class Client {
    private static int calculatePrice(ItemElement[] itemElement){
        ShoppingCartVisitor shoppingCartVisitor = new ShoppingCartVisitorImpl();

        int sum = 0;

        for(ItemElement item: itemElement){
            sum = sum + item.accept(shoppingCartVisitor);
        }
        return sum;
    }

    public static void main(String[] args){
        ItemElement[] items = new ItemElement[]{ new Book(23, "1234"),
                new Book(100, "15678902345"), new Fruit(5,5,"banana"),
                new Fruit(8,24,"apple")};

        int total = calculatePrice(items);
        System.out.println(" Total Cost: " + total);
    }
}




//separating functionality from the object structure very interesting concept