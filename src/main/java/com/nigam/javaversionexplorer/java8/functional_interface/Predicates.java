package com.nigam.javaversionexplorer.java8.functional_interface;

import com.nigam.javaversionexplorer.classes.Student;
import com.nigam.javaversionexplorer.utility.Util;

import java.util.function.Predicate;

public class Predicates {

    public static void main (String[] args) {

        //Q1. Predicate to check if a collection is already empty or not.
        System.out.println(Util.isCollectionEmpty.test(Util.getStudentList()));


        // --------Predicate Chaining---------------

        //Q2. Predicate to find Students whose mark greater than 60 and last digit of registration number is even.
        Predicate<Student> isGradeA = student -> student.getMarks() >= 60;
        Predicate<Student> isEvenRegistrationNumber = student -> student.getRegistrationNumber().charAt(student.getRegistrationNumber().length() - 1) % 2 == 0;
        for(Student student: Util.getStudentList()) {
            if(isGradeA.and(isEvenRegistrationNumber).test(student)) {
                System.out.println(student);
            }
        }

        //Q3. Predicate to find Students whose mark less than 60 or last digit of registration number is even.
        for(Student student: Util.getStudentList()) {
            if(isGradeA.negate().or(isEvenRegistrationNumber.negate()).test(student)) {
                System.out.println(student);
            }
        }


    }
}
