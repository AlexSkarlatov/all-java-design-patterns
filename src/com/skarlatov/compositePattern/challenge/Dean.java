package com.skarlatov.compositePattern.challenge;

import java.util.ArrayList;


public class Dean implements FacultyComponent{
    ArrayList<FacultyComponent> subordinates = new ArrayList<>();
    private String name, dept, degree;
    private double salary;

    //    public  Dean(){
//
//    }
    public Dean(String name, String dept, String degree, double salary){
        this.name = name;
        this.dept = dept;
        this.degree = degree;
        this.salary = salary;
    }

    @Override
    public void showDetails() {
        System.out.println( "heres some stuff about the dean" +
                " name and sallayr whatever");
        for(FacultyComponent f : subordinates){
            System.out.println("h");
            f.showDetails();
        }
    }

    // TODO methods for handling the undersling, add, remove, etc.
    //lotta repeated code shouldve just made this extends from a boss class
    public void add(FacultyComponent f){
        subordinates.add(f);
    }
    public void remove(FacultyComponent f){
        subordinates.remove(f);
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
