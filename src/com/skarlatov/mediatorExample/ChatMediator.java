package com.skarlatov.mediatorExample;


import java.util.ArrayList;
import java.util.List;

/*
how to communciate with all other object this interface defines how to communciate with al other objects

 */
public interface ChatMediator {

    public void sendMessage(String msg, User user);
    void addUser(User user);
}



class ChatMediatorImpl implements ChatMediator {
    private List<User> userList ;

    public ChatMediatorImpl(){
        this.userList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
//        this.userList.add(user);
        for(User u: userList){
            if(u != user){
                u.receive(msg);
            }
        }
    }
    @Override
    public void addUser(User user) {
        this.userList.add(user);
    }
}