package com.skarlatov.memento_pattern.challengeAttempt.civGameSaveFunction;

import com.skarlatov.memento_pattern.challenge.Memento;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WorldOriginator {
    //state
    int sciencePerTurn, culturePerTurn, faithPerTurn, faithBank;
    ArrayList<CivilizationBECity> playerCities;


    public WorldOriginator(){
        playerCities.add(new CivilizationBECity());
        this.sciencePerTurn = 10;
        this.culturePerTurn = 8;
        this.faithBank = 0;
        this. faithPerTurn = 0;

    }
    public WorldOriginator(int sciencePerTurn, int culturePerTurn, int faithPerTurn , int faithBank)
    {
        playerCities.add(new CivilizationBECity());
        this.sciencePerTurn = sciencePerTurn;
        this.culturePerTurn = culturePerTurn;
        this.faithBank = faithBank;
        this. faithPerTurn = faithPerTurn;
    }






    public CivBEMemento save(){

        //just to be sure it is deep copy
//        ArrayList<CivilizationBECity> deepList = new ArrayList<>(playerCities);
//        return new CivBEMemento(this.sciencePerTurn,this.culturePerTurn,this.faithPerTurn,this.faithBank, deepList);

        return new CivBEMemento(this.sciencePerTurn,this.culturePerTurn,this.faithPerTurn,this.faithBank,this.playerCities);
    }

    public void setMementoSaveFile(CivBEMemento memento){
        //this mehtod will take the memento and populate
        // the current object withthe memento game state

//        this.sciencePerTurn = 10;
//        this.culturePerTurn = 8;
//        this.faithBank = 0;
//        this. faithPerTurn = 0;



    }
    public CivBEMemento createMemento(){




    }

    private class CivBEMemento{
        private int sciencePerTurn, culturePerTurn, faithPerTurn, faithBank;
        private ArrayList<CivilizationBECity> playerCities;



//        public CivBEMemento(){
//
//        }

        public CivBEMemento(int sciencePerTurn, int culturePerTurn, int faithPerTurn , int faithBank, ArrayList<CivilizationBECity> playerCities){
            this.sciencePerTurn = sciencePerTurn ;
            this.culturePerTurn = culturePerTurn;
            this.faithBank = faithPerTurn;
            this. faithPerTurn = faithBank;
            this.playerCities = new ArrayList<CivilizationBECity>(playerCities);
        }
        public int getSciencePerTurn() {
            return sciencePerTurn;
        }

        public void setSciencePerTurn(int sciencePerTurn) {
            this.sciencePerTurn = sciencePerTurn;
        }

        public int getCulturePerTurn() {
            return culturePerTurn;
        }

        public void setCulturePerTurn(int culturePerTurn) {
            this.culturePerTurn = culturePerTurn;
        }

        public int getFaithPerTurn() {
            return faithPerTurn;
        }

        public void setFaithPerTurn(int faithPerTurn) {
            this.faithPerTurn = faithPerTurn;
        }

        public int getFaithBank() {
            return faithBank;
        }

        public void setFaithBank(int faithBank) {
            this.faithBank = faithBank;
        }

        public ArrayList<CivilizationBECity> getPlayerCities() {
            return playerCities;
        }

        public void setPlayerCities(ArrayList<CivilizationBECity> playerCities) {
            this.playerCities = playerCities;
        }




        public void getState(){

        }
    }




}
