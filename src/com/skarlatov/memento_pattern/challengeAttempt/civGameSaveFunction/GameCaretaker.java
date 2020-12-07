package com.skarlatov.memento_pattern.challengeAttempt.civGameSaveFunction;

import com.skarlatov.memento_pattern.FileWriterUtil;

import java.util.ArrayList;

public class GameCaretaker {



    private Object object;
    private ArrayList<Object> objects;



    public void save(WorldOriginator worldOriginator){
        this.object = worldOriginator.save();
        this.objects.add(worldOriginator.save());
    }
    public void undo(WorldOriginator worldOriginator){
        worldOriginator.undo(Object);
    }

//    //the caretaker class interacts with the memento internal class via the external class
////    using an reference to the external class
//
//    //reference to the memento
//    private Object object;
//
//    public void save(FileWriterUtil originator){
//        this.object = originator.save();
//    }
//
//    public void undo(FileWriterUtil originator){
//        originator.undoToLastSave(object);
//    }


}
