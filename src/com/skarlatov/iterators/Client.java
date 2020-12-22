package com.skarlatov.iterators;

public class Client {

    public static void main(String[] args){


        NotificationCollection nc = new NotificationCollection();
        nc.addItem("alsdkfjasdflkj");
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();

    }



}
