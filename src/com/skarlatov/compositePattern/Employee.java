package com.skarlatov.compositePattern;


public interface Employee {

    public void showEmployeeDetails();
}



//leaf component
class Developer implements Employee{
    private String name;
    private long empId;
    private String position;

    public Developer(long empId, String name, String position){
        this.name = name;
        this.empId = empId;
        this.position = position;
    }

    @Override
    public void showEmployeeDetails() {
        //TODO REFACTOR THIS SO IT LOOks nicer
        System.out.println("-------------------");
        System.out.println("Name = " );
        System.out.println("salary =" );
        System.out.println("---------------------");
        System.out.println("employee detailas\n" +
                ": name:" + name +"::" +  empId +
                "position: " +
                position  );
    }
}

//could be a leaf but for this we will assume it doesn ot
//refactor put it into a hierarchy
//class Manager implements Employee {
//    private String name;
//    private long empId;
//    private String position;
//    //data fields unique to a manager
//    public Manager(long empId, String name, String position){
//        this.name = name;
//        this.empId = empId;
//        this.position = position;
//    }
//
//    //methods unique to a manger
//
//    @Override
//    public void showEmployeeDetails() {
//        System.out.println("employee detailas\n" +
//                ": name:" + name +"::" +  empId +
//                "position: " +
//                position  );
//    }
//}