package com.skarlatov.observerDesignPattern;

public interface Observer {
    //method to update the observer, used by the subject
    public void update();

    //attach with subject to obser ver not required , but, added so that the observer can query the subject to see if an update has occured
//    observer can query the subject to see if an update has occured
    public void setSubject(Subject sub);
}


class MyTopicSubscriber implements Observer {
    private String name;

    // not required , could just pass the subjectw state tothe update method but also used to attach
    private Subject topic;
    public MyTopicSubscriber(String nm){
        this.name = nm;

    }


    // no need for reference to topic , topic logic can use this overloaded method when only a casual relationship exists between observer and subject
    //required to implement additional corresponding logic in the subject interace
    public void update(String postContent){
        this.name = postContent;
    }
    @Override
    public void update() {
        //this method could take data of subjects state that was changed , do not need to ask top
        String msg = (String ) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name + " no new message to consume");
        }
        else{
            System.out.println(name + " :: Consumeing message :: " + msg);

        }

    }

    @Override
    public void setSubject(Subject sub) {
        // not requried this was added so the observer can ask for state
        this.topic = sub;

    }
}