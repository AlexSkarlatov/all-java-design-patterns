package com.skarlatov.compositePattern.challenge;


//TODO name a professor professor farnsworth and also phillip j fry
class Professor implements FacultyComponent {


    //members
    //name postiion officnumber
    double officeNumber;
    String name, position;
    public Professor(){

    }
    public Professor(String name, String position, double officeNumber){
        this.name = name;
        this.officeNumber = officeNumber;
        this.position= position;
    }
    //leaf implmenetation


    //getters and setters
    public double getOfficeNumber() {
        return officeNumber;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public void showDetails() {
        System.out.println("professors name = "+ getName()+ " officenumber = " + getOfficeNumber() + "position = " + getPosition());
    }

    @Override
    public void add(FacultyComponent facultyComponent) {
        //TODO EXCEOPTIONHANDLING HERE FOR A NO OPERATRION
        System.out.println("no op");
    }

    @Override
    public void remove(FacultyComponent facultyComponent) {
        //TODO EXCEOPTIONHANDLING HERE FOR A NO OPERATRION
        System.out.println("no op");
    }
}