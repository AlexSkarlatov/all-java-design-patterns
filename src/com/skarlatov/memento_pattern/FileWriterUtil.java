package com.skarlatov.memento_pattern;

public class FileWriterUtil {
    //THIS IS MY ORIGINATOR PARTICIPANT AND ITS JOB IS TO CREATE A MEMENTO AS A SNAPSHOT

    //MEMBER VAR
    private String filename;
    private StringBuilder content;

    //CONSTRUCTUR
    public FileWriterUtil(String filename){
        this.filename = filename;
        this.content = new StringBuilder();

    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String str){
        content.append(str);
    }
    //creates the memento
    public Memento save(){
        return new Memento(this.filename, this.content);
    }


    public void undoToLastSave(Object obj){
        Memento memento = (Memento)obj;

        this.filename = memento.filename;
        this.content = memento.content;
    }

    ///inner class memento , only the originator has access to the memenot bcuz inner classs
    private class Memento
    {
        // cannot inherit must only duplicate an d mimic
//        inheritance will override and cause problems

        private String filename;
        private StringBuilder content;

        ///constructor
        public  Memento(String filename , StringBuilder content){
            /// it is important that this memento becrateing a deep copy and
            //does not refere the same objects but has a copy ofy the object
            this.filename = filename;
            this.content = new StringBuilder(content);
        }
    }
}


//caretaker keeps track of may mementos