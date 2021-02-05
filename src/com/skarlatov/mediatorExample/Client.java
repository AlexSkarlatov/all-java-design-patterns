package com.skarlatov.mediatorExample;

public class Client {

    public static void main(String[] args){
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "John 117");
        User user2 = new UserImpl(mediator, "Guilty Spark");
        User user3 = new UserImpl(mediator, "Cortana");
        User user4 = new UserImpl(mediator, "Arbiter");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user2.send("you must ignite the halo array and stop the flood, reclaimer!");
        user3.send("no don't");
        user4.send("by the prophets!");
    }


}
