package com.nigam.javaversionexplorer.java8.optional;

import com.nigam.javaversionexplorer.classes.Student;
import com.nigam.javaversionexplorer.utility.Util;

import java.util.Optional;

public class Optionals {
    public static void main(String[] args) {
        Student existingStudent = null;
        Optional<Student> student = Util.getStudentByStudentName.apply("Tom");

        if(!student.isPresent()) {
            System.out.println(student.get().getName());
        } else {
            Optional.empty();
        }

        existingStudent = student.orElse(Util.defaultStudentSupplier.get());
        System.out.println("Existing Student : "+existingStudent);

        existingStudent = student.orElseGet(Util.defaultStudentSupplier);
        System.out.println("Existing Student : "+existingStudent);

        if(!student.isPresent()) existingStudent = student.orElseThrow(()->new RuntimeException("No default Student Found"));
        System.out.println("Existing Student : "+existingStudent);

        System.out.println(existingStudent.equals(student));

    }
}
