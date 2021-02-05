package com.skarlatov.observerDesignPattern;

public class Client {
    public static void main(String[] ars){
        //create subject
        MyTopic topic = new MyTopic();

        //create Observers
        Observer obj1 = new MyTopicSubscriber("cortana");
        Observer obj2 = new MyTopicSubscriber("Master Chief");
        Observer obj3 = new MyTopicSubscriber("Arbiter");

        //register observers to the subjet, could possibly add the registration as part of the observer constructor logic
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        //attach subject to the observer ) not required, could have passed in subject state to update method

        obj1.setSubject(topic);
        obj2.setSubject(topic);
        obj3.setSubject(topic);

        //check if any update is available, not requireed
        obj1.update();

        //send message to subject, change state of subject, trigger notifyAll()
        topic.postMessage("this is a new Message");

    }

}

