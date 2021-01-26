package com.skarlatov.randomWalk;
/*
this is a random walk simulator cliant game thing. it will have many functionalities and game modes
but for now I will just use String builder and a 2d array to create a simple walking simulation
 */
public class Client {

    StringBuilder s = new StringBuilder();

    public static void display(StringBuilder[] stringBuilders){
        for(int i = 0 ; i < stringBuilders.length; i++){
//            StringBuilder s = new StringBuilder(stringBuilders[i]);
            System.out.print(stringBuilders[i].toString());

        }
    }
    public static StringBuilder[] initializer(StringBuilder[] stringBuilders){
        for(int i = 0 ; i < stringBuilders.length; i++){
            stringBuilders[i] =  new StringBuilder();
            for (int j = 0 ; j < 10 ; j++){
                stringBuilders[i].append("=\t");
            }
            stringBuilders[i].append("\n");
        }
        return stringBuilders;
    }
    public static void main(String[] args){
        // the board game map thing

//        Node[][] stringBuilders = new Node[10][10]
        StringBuilder[] stringBuilders = new StringBuilder[10];
        stringBuilders =  initializer(stringBuilders);
        display(stringBuilders);

    }



}
