package com.nigam.javaversionexplorer.java8.stream;

import com.nigam.javaversionexplorer.classes.Student;
import com.nigam.javaversionexplorer.utility.Util;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupBy {
    public static void main(String[] args) {

        //Q. Group Students by their Age
        List<Student> studentList = Util.getStudentList();
        Map<Integer,List<Student>>  studentsGroupedByAge = studentList.stream().collect(Collectors.groupingBy(Student::getAge));
        System.out.println(studentsGroupedByAge);

        //Q. Group Student names grouped by their Age
        Map<Integer,List<String>>  studentNamesGroupedByAge = studentList.stream()
                .collect(Collectors.groupingBy(Student::getAge, Collectors.mapping(Student::getName, Collectors.toList())));
        System.out.println(studentNamesGroupedByAge);

        //Q. Find Frequency of characters in a string
        String string = "Any Random String";
        Map<Character, Long> characterIntegerMap = string.chars()
                .filter( c -> c != ' ')
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(characterIntegerMap);

    }
}
