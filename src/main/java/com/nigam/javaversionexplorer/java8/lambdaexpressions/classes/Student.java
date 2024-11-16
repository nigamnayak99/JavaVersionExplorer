package com.nigam.javaversionexplorer.java8.lambdaexpressions.classes;


public class Student {
    String name;
    int marks;

    public Student(String name, int marks, String registrationNumber) {
        this.name = name;
        this.marks = marks;
        this.registrationNumber = registrationNumber;
    }

    String registrationNumber;

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "\nStudent{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", registrationNumber='" + registrationNumber +
                "}";
    }

}
