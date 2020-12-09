package com.skarlatov.memento_pattern.challengeAttempt.civGameSaveFunction;

import com.skarlatov.memento_pattern.FileWriterUtil;

import java.util.ArrayList;

public class GameCaretaker {



    private Object object;
    private ArrayList<Object> objects;



    public void save(WorldOriginator worldOriginator){
        this.object = worldOriginator.save();
        // code to add save() lines to the list is not yet created

        //todo fix this line of code
//        this.objects.add(worldOriginator.save());
    }
    //to use the multiple save file I would have to complexify this method by adding an extra parameter
    // an int parameter would be added to track down the correct save file
    //or alternatively upon creation of a carateaker object it must maintain a reference to an originator object which it is managing its save files for
    public void undo(WorldOriginator worldOriginator){
        worldOriginator.undo(object);
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
