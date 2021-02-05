package com.skarlatov.compositePattern.challenge;

import java.util.ArrayList;

public interface FacultyComponent {
    public void showDetails();
    public void add(FacultyComponent facultyComponent);
    public void remove(FacultyComponent facultyComponent);
    //TODO REFACTOR ALL THAT IMPLEMNT THIS INTERFACE TO DISPLAY SUBORDINATES IMMEDIATLY UNDER THEM
//    public void showImmediateSubordinates();
}
//implement dean chair and profesors

//ChairPersonComposit, composotiet