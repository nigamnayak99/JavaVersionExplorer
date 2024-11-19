package com.nigam.javaversionexplorer.java8.lambda_expression;

import com.nigam.javaversionexplorer.types.Student;
import com.nigam.javaversionexplorer.utility.Util;

import java.util.Collections;
import java.util.List;

public class LambdaSortCollection {

    public static void main(String[] args) {


        List<Student> studentList = Util.getStudentList();
        Collections.sort(studentList, (s1, s2) -> s1.getMarks() - s2.getMarks());
        System.out.println(studentList);
    }

}
