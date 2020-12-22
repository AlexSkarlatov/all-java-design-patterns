package com.skarlatov.interpreterExample.interpreterChallenge;

public class Client {

    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("robert");
        Expression john = new TerminalExpression("john");

        return new OrExpression(robert,john);
    }

    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("married");
        return new AndExpression(julie,married);
    }

    public static void main(String[] args){
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();


        Context ic1 = new Context("john");
        System.out.println(" John is male? " + isMale.interpret(ic1));

        Context ic2 = new Context("Married Julie");
        System.out.println("JUlie is a married woman?" + isMarriedWoman.interpret(ic2));

        Context ic3 = new Context("Lucy" ) ;
        System.out.println("Lucy is male?  " + isMale.interpret(ic3));
    }










}
