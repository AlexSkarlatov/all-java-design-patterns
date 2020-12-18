package com.skarlatov.interpreterExample;

public class Client {
    public InterpreterContext ic;


    public Client(InterpreterContext i){
        this.ic = i;
    }
    public String interpret(String str){
        Expression exp = null;
        //perofmr the aprsing
        if(str.contains("hexadecimal")){
            exp = new IntToHexExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        }
        else if(str.contains("binary")){
            exp = new IntToBinaryExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        }
        else{
            return str;
        }
        return exp.interpret(ic);
    }

    public static void main(String[] args){
        String str1 = "28 in binary";
        String str2 = "28 in hexadecimal";

        Client ec = new Client(new InterpreterContext());

        System.out.println(str1 + " = " + ec.interpret(str1));
        System.out.println(str2 + " = " + ec.interpret(str2));

    }


}
