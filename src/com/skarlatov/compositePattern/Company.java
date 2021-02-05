package com.skarlatov.compositePattern;

public class Company {

    public static void main(String[] args){
        Employee dev1 = new Developer(100, "Alexander Skarlatov", "Pro developer");
        Employee dev2 = new Developer(101, "Michael S", "jr developer");

        Manager engDirectory = new Manager("asdj", 555555);
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee man1 = new Manager( "j", 5555);
        Employee man2 = new Manager( "f", 12347);

        Manager accDirectory = new Manager("ja", 5555);
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        Manager companyDirectory = new Manager("jsddfs", 5555);
        companyDirectory.addEmployee(engDirectory);
        companyDirectory.addEmployee(accDirectory);
        companyDirectory.showEmployeeDetails();
    }


}
