package com.nigam.javaversionexplorer.types;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    String name;
    int marks;
    String registrationNumber;


    @Override
    public String toString() {
        return "\nStudent{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", registrationNumber='" + registrationNumber +
                "}";
    }

}
