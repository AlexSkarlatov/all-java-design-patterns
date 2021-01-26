package com.skarlatov.compositePattern;



import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee {
    private String name;
    private double salary;

    public Manager(String name, double salary){
        this.name = name;
        this.salary = salary;
    }


    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showEmployeeDetails() {
//        TODO add member field called String description
        //some data about this directory type refactor lator
        //system.out.println(description);
        System.out.println("-------------------");
        System.out.println("Name = " + getName());
        System.out.println("salary =" + getSalary());
        System.out.println("---------------------");
        for(Employee e: employeeList){
            e.showEmployeeDetails();
        }
    }
    public double getSalary(){
        return this.salary;
    }
    public String getName(){
        return this.name;
    }
    public Employee getChild(int i ) {
        return employeeList.get(i);
    }
    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }
    public void removeEmployee(Employee emp){
        employeeList.remove(emp);
    }
}