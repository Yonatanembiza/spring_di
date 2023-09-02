package com.spring_dependncyinjection.di.spring_di;

public class Student {

    private String studentName;
    private int studentID;

    public void setStudentName(String name) {
        this.studentName = name;
    }

    public void setStudentID(int ID) {
        this.studentID = ID;
    }

    public Student() {
        System.out.println("Inside the default constructor"); // This is not a good practice, because it will be called
                                                              // for every instance of
    }

    public void displayStudentInfo() {
        System.out.println("The student name is: " + studentName + " and the student ID is: " + studentID);
    }

}