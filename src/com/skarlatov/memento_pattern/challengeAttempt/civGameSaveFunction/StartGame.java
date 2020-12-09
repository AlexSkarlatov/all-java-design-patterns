package com.skarlatov.memento_pattern.challengeAttempt.civGameSaveFunction;

import com.skarlatov.memento_pattern.FileWriterCaretaker;
import com.skarlatov.memento_pattern.FileWriterUtil;

public class StartGame {
    public static void main(String... args){
        //STEP ONE CREATE THE ORIGINATOR AND THE  caretaker object
        //TODO CREATE THE ORIGNATOR AND THE CARETAKER

        //TODO IN THE ORIGNIATOR YOU MUST CHANGE STATE


        //TODO IN THE ORIGINATOR YOU MUST SAVE STATE TEST TO SEE IT WORKS

        //TODO IN THE ORIGINATOR YOU MUST CHANGE STATE THEN PRINT OUT

        //TODO IN THE ORIGNATOR YOU MUST REVERT STATE BACK AND PRINT IT OUT TO SEE IF IT WORKS



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