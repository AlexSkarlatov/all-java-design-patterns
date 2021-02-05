package com.skarlatov.mediatorExample.mediatorChallenge;

abstract class Buyer {
    // this class defines the buyer colleggue template
    protected Mediator mediator;
    protected String name;
    protected int price;

    public Buyer(Mediator m, String name){
        this.mediator  = m;
        this.name = name;

    }


    //these colleague methods are how the logic will communicate to the mediator and back
    public abstract void bid(int price);
    public abstract void cancelTheBid();
    public abstract void auctionHasEnded();

}

class AuctionBuyer extends Buyer{
    public AuctionBuyer(Mediator m, String name){
        super(m, name);
    }


    //simple send message to mediator method
    @Override
    public void bid(int price) {
        this.price = price;
//        mediator.announceBid(price);
    }

    @Override
    public void cancelTheBid() {
        this.price = -1;
        System.out.println(name + "cancelling bid");

    }
// simple recieve method
    @Override
    public void auctionHasEnded() {
        System.out.println("Received Message that the auction is over " + name);
    }
}
