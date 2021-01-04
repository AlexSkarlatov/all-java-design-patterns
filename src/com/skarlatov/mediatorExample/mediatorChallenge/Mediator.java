package com.skarlatov.mediatorExample.mediatorChallenge;

import java.util.ArrayList;

public interface Mediator {
    public void addBuyer(Buyer buyer);

    public void findHighestBidder();



}


class AuctionMediator implements Mediator {
    /*
    this class will implelment the mediator methods and hold a
    all the buyers in a list. we can add buyres and find highest bidder
     */
    private ArrayList<Buyer>  buyers;
    public AuctionMediator(){
        buyers = new ArrayList<Buyer>();
    }

    @Override
    public void addBuyer(Buyer buyer) {
        buyers.add(buyer);
        System.out.println(buyer.name + " was added tot he list");
    }

    @Override
    public void findHighestBidder() {
        Buyer winner = null;
        int maxBid = 0;

        for(Buyer b : buyers){
            if(b.price > maxBid){
                winner = b;
                maxBid = b.price;
            }
            b.auctionHasEnded();
        }
        System.out.println("the auction winner is " + winner.name + ". he paid " + winner.price + " $ for the item");
    }
}