package com.nigam.javaversionexplorer.java8.optional;

import com.nigam.javaversionexplorer.classes.Student;
import com.nigam.javaversionexplorer.utility.Util;

import java.util.Optional;


public class MapVsFlatMap {

    public static void main(String[] args) {


        // Get the student named "Tom" using Util.getStudentByStudentName. It returns an Optional<Student>.
        Optional<Student> optionalStudent = Util.getStudentByStudentName.apply("Tom");

        // Transform the value inside the Optional using map to extract the student's marks.
        // If a student is present, it will retrieve the marks; if absent, it returns an empty Optional.
        Optional<Integer> optionalMark = optionalStudent.map(Student::getMarks);

        // If the student is found, print the marks; otherwise, print -1.
        // orElse(-1) ensures that in case of an empty Optional, -1 will be printed.
        System.out.println("Student Mark: " + optionalMark.orElse(-1)); // Output: Student Mark: <marks>

        // Transform the value using flatMap. In this case, the method extractMarkFromStudent returns an Optional.
        // The flatMap approach is used when the transformation itself can also return an Optional.
        Optional<Integer> optionalMark1 = optionalStudent.flatMap(Util::extractMarkFromStudent);


        // With flatMap, if the student is found and extractMarkFromStudent provides a valid Optional,
        // it will return the mark directly. Otherwise, it will return an empty Optional.


    }
}
