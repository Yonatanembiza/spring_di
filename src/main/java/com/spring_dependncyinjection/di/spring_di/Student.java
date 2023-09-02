package com.spring_dependncyinjection.di.spring_di;

public class Student {

    private String studentName;
    private int studentID;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void displayStudentInfo() {
        System.out.println("The student name is: " + studentName + "and the student ID is: " + studentID);
    }

}