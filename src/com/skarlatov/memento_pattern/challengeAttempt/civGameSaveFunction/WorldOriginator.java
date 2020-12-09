package com.skarlatov.memento_pattern.challengeAttempt.civGameSaveFunction;

import com.skarlatov.memento_pattern.challenge.Memento;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class WorldOriginator {
    //state
    int sciencePerTurn;
    int culturePerTurn;
    int faithPerTurn;
    int faithBank;
    ArrayList<CivilizationBECity> playerCities = new ArrayList<>();


    // to string method added for health check and testing
    //todo polish the appearance of the toSTring method and call it game status or notification or something
    @Override
    public String toString() {
        return "WorldOriginator{" +
                "sciencePerTurn=" + sciencePerTurn +
                ", culturePerTurn=" + culturePerTurn +
                ", faithPerTurn=" + faithPerTurn +
                ", faithBank=" + faithBank +
                ", playerCities=" + playerCities +
                '}';
    }

    //    public String toString(){
//        return " ";
//    }
//getters basic
    //TODO BETTER OFF TO SET THESE TO PRIVATE AND EXPOSE AN ENCAPSULATED METHOD TO A SEPARATED CLASS TO MANAGE RADICAL CHANGE IN GAME FUNCTION
    public int getSciencePerTurn() {
        return sciencePerTurn;
    }

    public int getCulturePerTurn() {
        return culturePerTurn;
    }

    public int getFaithPerTurn() {
        return faithPerTurn;
    }

    public int getFaithBank() {
        return faithBank;
    }

    //setters basic
    public void setSciencePerTurn(int sciencePerTurn) {
        this.sciencePerTurn = sciencePerTurn;
    }

    public void setCulturePerTurn(int culturePerTurn) {
        this.culturePerTurn = culturePerTurn;
    }

    public void setFaithPerTurn(int faithPerTurn) {
        this.faithPerTurn = faithPerTurn;
    }

    public void setFaithBank(int faithBank) {
        this.faithBank = faithBank;
    }


    //adding more resources per turn
    public void addSciencePerTurn(int sciencePerTurn) {
        this.sciencePerTurn += sciencePerTurn;
    }

    public void addCulturePerTurn(int culturePerTurn) {
        this.culturePerTurn += culturePerTurn;
    }

    public void addFaithPerTurn(int faithPerTurn) {
        this.faithPerTurn += faithPerTurn;
    }



    public WorldOriginator(){
//        playerCities = new ArrayList<>();
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

    public  void undoToSpecificSave(Object mementoObject){
        CivBEMemento memento = (CivBEMemento) mementoObject;

        //usememento object to overwrite this objects current state fields
        playerCities = new ArrayList<>(memento.getPlayerCities());
        this.sciencePerTurn = memento.getSciencePerTurn();
        this.culturePerTurn = memento.getCulturePerTurn();
        this.faithBank = memento.getFaithBank();
        this. faithPerTurn = memento.getFaithPerTurn();

    }
    public void undo(Object mementoObject){
        CivBEMemento memento = (CivBEMemento)mementoObject;


        //use memtno object to overwrite this objects current state fields
        playerCities = new ArrayList<>(memento.getPlayerCities());
        this.sciencePerTurn = memento.getSciencePerTurn();
        this.culturePerTurn = memento.getCulturePerTurn();
        this.faithBank = memento.getFaithBank();
        this. faithPerTurn = memento.getFaithPerTurn();
//        playerCities.add(new CivilizationBECity());
//        this.sciencePerTurn = sciencePerTurn;
//        this.culturePerTurn = culturePerTurn;
//        this.faithBank = faithBank;
//        this. faithPerTurn = faithPerTurn;
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
//    public CivBEMemento createMemento(){
//
//    }

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
            this.playerCities = new ArrayList<>(playerCities);
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
