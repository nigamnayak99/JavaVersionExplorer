package com.nigam.javaversionexplorer.java8.functional_interface;

import com.nigam.javaversionexplorer.types.Student;
import com.nigam.javaversionexplorer.utility.Util;

import java.util.List;

public class Functions {

    public static void main (String[] args) {


        //Q1: Convert Student names to upper case.
        List<Student> studentList = Util.getStudentList();
        Util.convertStudentNameToUpperCase.apply(studentList);
        for(Student student: studentList) {
            System.out.println(student);
        }

    }
}
