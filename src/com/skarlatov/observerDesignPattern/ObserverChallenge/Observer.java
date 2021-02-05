package com.skarlatov.observerDesignPattern.ObserverChallenge;

 interface Observer {
    void update(int runs, int wickets, float overs);
}


class AverageScoreDisplay implements Observer {
    private float runRate;
    private int predictedScore;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.runRate = (float) runs/overs;
        this.predictedScore = (int) (this.runRate * 50);
        display();
    }
     void display(){
        System.out.println("\n average dispaly : \n" +
                "runRate: " + runRate +" \n Predicted Score: "
        + predictedScore);
    }
}
class CurrentScoreDisplay implements Observer {
    private int runs, wickets;
    private float overs;

    @Override
    public void update(int runs, int wickets, float overs) {
        this.overs = overs;
        this.runs = runs;
        this.wickets = wickets;
        display();
    }
    public void display(){
        System.out.println("\n current score dispaly : \n" +
                "runs: " + runs +"" +
                " \n wcikets: "
                + wickets +
                "\n overs: " + overs);
    }
}