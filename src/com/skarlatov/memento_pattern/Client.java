package com.skarlatov.memento_pattern;

public class Client {

    public static void main(String[] args){
        FileWriterCaretaker fileWriterCaretaker = new FileWriterCaretaker();


        FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");
        fileWriterUtil.write("first set of data ,\nAlpha, Bravo, Charlie");

        System.out.println("\n\n===================" + fileWriterUtil + "===================\n\n");

        fileWriterCaretaker.save(fileWriterUtil);

        fileWriterUtil.write("\nsecond set of data , Delta, ECho  foxtrot, golf \n");

        System.out.println("\n\n===================" + fileWriterUtil + "===================\n\n");

        fileWriterCaretaker.undo(fileWriterUtil);

        System.out.println("\n\n=undo==================" + fileWriterUtil + "===================\n\n");

//        System.out.println()


//        the client knows nothing about the inner class "memento " rather it only knows about the originator  and the caretaker
//                the caretaker is what manages the state of the memento while the originator is what is subjected to the changes
//

    }

}
