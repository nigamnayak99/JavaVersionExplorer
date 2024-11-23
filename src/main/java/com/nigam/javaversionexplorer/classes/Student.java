package com.nigam.javaversionexplorer.classes;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    String name;
    int marks;
    int age;
    String registrationNumber;


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", age=" + age +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}
