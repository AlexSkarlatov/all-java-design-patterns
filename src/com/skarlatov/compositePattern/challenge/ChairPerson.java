package com.skarlatov.compositePattern.challenge;

import java.util.ArrayList;

public class ChairPerson implements FacultyComponent {
    ArrayList<FacultyComponent> subordinates = new ArrayList<>();
    private String name, dept, degree;
    private double salary;
    //    public  ChairPerson(){
//
//    }
    public ChairPerson(String name, String dept, String degree, double salary){
        this.name = name;
        this.dept = dept;
        this.degree = degree;
        this.salary = salary;

    }
    public void getMyUnderlings(){
        for(FacultyComponent f : subordinates){
            // can make certain assumptions if object is isntance of chair person.
            //for example that all elements in its subordinate list are either sutdent or professor
            // thus implement logic that tests for instance of and prints description based on which using
            // getter mehtods or a toString() method
        }
    }
    @Override
    public void showDetails() {
        System.out.println( "heres some stuff about the chair person" +
                " name and sallayr whatever");
        for(FacultyComponent f : subordinates){
            System.out.println("h");
            f.showDetails();
        }
    }
    // TODO methods for handling the undersling, add, remove, etc.


    @Override
    public void add(FacultyComponent facultyComponent) {
        subordinates.add(facultyComponent);

    }

    @Override
    public void remove(FacultyComponent facultyComponent) {
        subordinates.remove(facultyComponent);
    }


    //TODO methods for handling member fields,
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}