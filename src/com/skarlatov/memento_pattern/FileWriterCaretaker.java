package com.skarlatov.memento_pattern;

public class FileWriterCaretaker {
    //the caretaker class interacts with the memento internal class via the external class
//    using an reference to the external class
    
    //reference to the memento
    private Object object;
    
    public void save(FileWriterUtil originator){
        this.object = originator.save();
    }
    
    public void undo(FileWriterUtil originator){
        originator.undoToLastSave(object);
    }
    

    
}
