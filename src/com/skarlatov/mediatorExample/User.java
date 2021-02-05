package com.skarlatov.mediatorExample;


/*
I forget what a colleague interface does
it defines a set of how to ?????
 */
abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String s){
        this.mediator = mediator;
        this.name = s;
    }
    public abstract void send(String msg);
    public abstract void receive(String msg);
}
/*
each colleague has a reference to its mediator object and only communicates to the mediator object to talk to a another colleague object

 */




class UserImpl extends User{
    public UserImpl(ChatMediator chatMediator, String theNameOfTheMediator){
        super(chatMediator, theNameOfTheMediator);
    }

    public void send(String msg, int key){

    }



    /*
    i'm just gonna send my message to the mediator and i have no idea how the mediator will handle it he just will do it.
    a great example of delegation
     */
    @Override
    public void send(String msg) {
        System.out.println(this.name + " :: Sending Message = " + msg + "currently in sender object");
        this.mediator.sendMessage(msg,this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + "has received the following message from another user::" + msg);
    }
}
