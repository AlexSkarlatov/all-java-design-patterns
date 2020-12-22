package com.skarlatov.iterators;

public class NotificationBar {

    NotificationCollection notificationCollection;

    public NotificationBar(NotificationCollection notificationCollection){
        this.notificationCollection = notificationCollection;

    }
    public void printNotifications(){
        Iterator i = notificationCollection.createIterator();
        System.out.println("------notification BAR------------");
        while (i.hasNext()){
            Notification notification = (Notification) (i.next());
            System.out.println(notification.getNotification());
        }
    }
}
