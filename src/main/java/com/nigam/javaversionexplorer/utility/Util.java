package com.nigam.javaversionexplorer.utility;

import com.nigam.javaversionexplorer.classes.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Util {

    public static Predicate<Collection> isCollectionEmpty = collection -> collection.isEmpty();
    public static Function<List<Student>, List<Student>> convertStudentNameToUpperCase =  studentList -> {
        for(Student student: studentList) {
            student.setName(student.getName().toUpperCase());
        }
        return studentList;
    };
    public static Supplier<Student> defaultStudentSupplier = ()-> new Student("Default Student", 100, "Default Registration number");

    public static Optional<Integer> extractMarkFromStudent(Student student) {
        return Optional.of(student.getMarks());
    }

    /**
     * A functional interface implementation that takes a student name as input and returns an Optional<Student>.
     *
     * Logic:
     * - Loops through the list of students obtained from the `getStudentList()` method.
     * - If a student with the matching name is found, it wraps the student object in an Optional and returns it.
     * - If no matching student is found, it returns an empty Optional (using Optional.ofNullable(null)).
     *
     * Note:
     * - Returning `Optional.ofNullable(null)` is redundant; you can use `Optional.empty()` instead for clarity.
     * - This implementation assumes the existence of the `getStudentList()` method and `Student` class with a `getName()` method.
     */
    public static Function<String, Optional<Student>> getStudentByStudentName = studentName -> {
        for(Student student: getStudentList()) {
            if(student.getName().equals(studentName)) return Optional.of(student);
        }
        return Optional.ofNullable(null);
    };

    public static List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mly", 85, "A123"));
        students.add(new Student("John", 70, "B456"));
        students.add(new Student("Jane", 90, "C789"));
        students.add(new Student("Tom", 65, "D012"));
        students.add(new Student("Alice", 92, "E345"));
        students.add(new Student("Bob", 75, "F678"));
        students.add(new Student("Charlie", 88, "G901"));
        students.add(new Student("Daisy", 80, "H234"));
        students.add(new Student("Eve", 95, "I567"));
        students.add(new Student("Frank", 60, "J890"));
        students.add(new Student("Grace", 89, "K123"));
        students.add(new Student("Hannah", 78, "L456"));
        students.add(new Student("Ian", 84, "M789"));
        students.add(new Student("Jack", 72, "N012"));
        students.add(new Student("Kelly", 91, "O345"));

        return students;
    }
}
