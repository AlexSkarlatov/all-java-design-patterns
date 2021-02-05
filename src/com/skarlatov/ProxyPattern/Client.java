package com.skarlatov.ProxyPattern;
//client class
public class Client {

    public static void main(String[] args) {
        // write your code here

        Image i = new ProxyImage("somefile.jpg");

        //image loade from disk
        i.display();
        System.out.println("");
        i.display();



    }
}