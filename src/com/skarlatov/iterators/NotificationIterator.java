package com.skarlatov.iterators;

public class NotificationIterator implements Iterator{

    Notification[] notificationList ;
    int pos= 0;

    public NotificationIterator(Notification[] notificationList){
        this.notificationList = notificationList;
    }


    @Override
    public boolean hasNext() {

        if(pos > notificationList.length || notificationList[pos] == null)
            return false;
        else
            return true;

//        return ;
    }

    @Override
    public Object next() {
        Notification n = notificationList[pos];
        pos++;
        return n;
    }
}
