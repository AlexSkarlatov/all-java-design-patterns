package com.skarlatov.memento_pattern.challengeAttempt.civGameSaveFunction;

import com.skarlatov.memento_pattern.FileWriterCaretaker;
import com.skarlatov.memento_pattern.FileWriterUtil;

public class StartGame {
    public static void main(String... args){
        //STEP ONE CREATE THE ORIGINATOR AND THE  caretaker object
        //CREATE THE ORIGNATOR AND THE CARETAKER
        GameCaretaker caretaker = new GameCaretaker();
        WorldOriginator worldOriginator = new WorldOriginator();
      // original value
        caretaker.save(worldOriginator);
        System.out.println(worldOriginator.toString());


        // IN THE ORIGNIATOR YOU MUST CHANGE STATE
        worldOriginator.addCulturePerTurn(55);
        worldOriginator.addFaithPerTurn(100);
        worldOriginator.addSciencePerTurn(500);

        // you must print out the initial state
//        worldOriginator.toString();
        System.out.println(worldOriginator.toString());
        // IN THE ORIGINATOR YOU MUST SAVE STATE TEST TO SEE IT WORKS
//        caretaker.save(worldOriginator);
        // IN THE ORIGINATOR YOU MUST CHANGE STATE THEN PRINT OUT
        // you must undo the state back to original
        // IN THE ORIGNATOR YOU MUST REVERT STATE BACK AND PRINT IT OUT TO SEE IF IT WORKS
        //todo make the comments much cleaner to read
        caretaker.undo(worldOriginator);
        System.out.println(worldOriginator.toString());



    }
}



//
//    FileWriterCaretaker fileWriterCaretaker = new FileWriterCaretaker();
//
//
//    FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");
//        fileWriterUtil.write("first set of data ,\nAlpha, Bravo, Charlie");
//
//                System.out.println("\n\n===================" + fileWriterUtil + "===================\n\n");
//
//                fileWriterCaretaker.save(fileWriterUtil);
//
//                fileWriterUtil.write("\nsecond set of data , Delta, ECho  foxtrot, golf \n");
//
//                System.out.println("\n\n===================" + fileWriterUtil + "===================\n\n");
//
//                fileWriterCaretaker.undo(fileWriterUtil);
//
//                System.out.println("\n\n=undo==================" + fileWriterUtil + "===================\n\n");
////