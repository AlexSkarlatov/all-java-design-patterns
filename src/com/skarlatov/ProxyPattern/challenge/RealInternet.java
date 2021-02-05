package com.skarlatov.ProxyPattern.challenge;

public class RealInternet implements InternetInterface{
    private String URLAddress;
    public RealInternet(){
    }
    public RealInternet(String address){
        this.URLAddress = address;
    }

    @Override
    public void connect(String destination) {
        this.URLAddress = destination;
        System.out.println("I am connecting to "  + URLAddress);
    }
}