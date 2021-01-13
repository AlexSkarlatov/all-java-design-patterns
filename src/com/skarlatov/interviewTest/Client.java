package com.skarlatov.interviewTest;

import java.util.*;

public class Client {

    public static Set<Integer> integerSet = new HashSet<>();




    public static  void main(String[] args){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee());

        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                if(o1.salary > o2.salary){
                    return 1;
                }
                else if(o1.salary < o2.salary){
                    return -1;
                }
                else {
                    return 0;
                }




            }
        });
        //
//        integerSet.add(1);
//        integerSet.add(2);
//        integerSet.add(1);

        System.out.println(integerSet.add(1));
        System.out.println(integerSet.add(2));
        System.out.println(integerSet.add(1));


        System.out.println(integerSet);
        System.out.println(integerSet.stream().sorted());
    }

}
class Employee {
    String name;
    int salary;
}