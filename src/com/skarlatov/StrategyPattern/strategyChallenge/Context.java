package com.skarlatov.StrategyPattern.strategyChallenge;

public class Context {
    public int executeStrategy(StratregyInt s, int num1, int num2){
        return s.performOperation(num1, num2);
    }
}
