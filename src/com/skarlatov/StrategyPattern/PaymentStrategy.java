package com.skarlatov.StrategyPattern;

import javax.swing.*;

public interface PaymentStrategy {
    public void pay(int amount);
}

class CreditCardStrategy implements PaymentStrategy{
    private String name, cardNumber, cvv, dateOfExpiry;

    public CreditCardStrategy(String nm,String cardNumber,String cvv,String dateOfExpiry){
        this.name = nm;
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.dateOfExpiry = dateOfExpiry;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit/debit card");
    }
}

class PaypalStrategy implements PaymentStrategy {
    private String emailID, password;
    public PaypalStrategy(String emailID, String password){
        this.emailID = emailID;
        this.password = password;
    }
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Paypal");
    }
}

