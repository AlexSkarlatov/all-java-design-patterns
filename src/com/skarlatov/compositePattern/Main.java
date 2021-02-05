package com.skarlatov.compositePattern;


public class Main {

    public static void main(String[] args) {
        // write your code here
        Employee dev1 = new Developer(100, "Alexander Skarlatov", "Pro developer");
        Employee dev2 = new Developer(101, "Michael S", "jr developer");

        Manager engManager = new Manager("Dan",25000 );
        engManager.addEmployee(dev1);
        engManager.addEmployee(dev2);

        Employee dev3 = new Developer(111, "tom" , "developer");

        Manager generalManager = new Manager("mark", 123000);
//        accDirectory.addEmployee(man1);
//        accDirectory.addEmployee(man2);
        generalManager.addEmployee(dev3);
        generalManager.addEmployee(engManager);
        generalManager.showEmployeeDetails();
    }
}