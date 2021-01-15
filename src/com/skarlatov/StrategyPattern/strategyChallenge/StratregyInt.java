package com.skarlatov.StrategyPattern.strategyChallenge;

public interface StratregyInt {
    public int performOperation(int num1, int num2);
}


class OperationAdd implements StratregyInt {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 = num2 + num1;
    }
}
class OperationMultiply implements StratregyInt {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 = num2 * num1;
    }
}
class OperationSubtract implements StratregyInt {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 = num1 - num2;
    }
}
class OperationDivide implements StratregyInt {
    @Override
    public int performOperation(int num1, int num2) {
        return num1 = num1 / num2;
    }
}