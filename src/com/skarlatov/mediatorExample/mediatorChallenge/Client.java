package com.skarlatov.mediatorExample.mediatorChallenge;

public class Client {
    public static void main(String[] args){
        AuctionMediator auctionMediator = new AuctionMediator();

        Buyer b1 = new AuctionBuyer(auctionMediator,"Jim Raynor");
        Buyer b2 = new AuctionBuyer(auctionMediator,"master Chief");
        Buyer b3 = new AuctionBuyer(auctionMediator,"Cortana");
        Buyer b4 = new AuctionBuyer(auctionMediator,"arbiter");

        auctionMediator.addBuyer(b1);
        auctionMediator.addBuyer(b2);
        auctionMediator.addBuyer(b3);
        auctionMediator.addBuyer(b4);

        System.out.println("Welcome to the aucction. tonight we are selleing a vacation");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(":waiting for byers to give offers");
        b1.bid(1111);
        b2.bid(2222);
        b3.bid(3333);
        b4.bid(4444);


        System.out.println("-------------------------------------------------------------");
        auctionMediator.findHighestBidder();

        b2.cancelTheBid();

        auctionMediator.findHighestBidder();
    }
}
