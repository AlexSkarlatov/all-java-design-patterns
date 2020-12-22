package com.skarlatov.interpreterExample.interpreterChallenge;

public interface Expression {
    //terminal conc class?
    public boolean interpret(Context context);


}


class TerminalExpression implements Expression {
    //terminal concrete class?


    private String data;
    public TerminalExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(Context context) {
        return context.getResult(data);

//        return expr1.interpret(context) && expr2.interpret(context);

    }
}













