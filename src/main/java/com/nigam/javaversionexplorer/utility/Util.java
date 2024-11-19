package com.nigam.javaversionexplorer.utility;

import com.nigam.javaversionexplorer.types.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class Util {

    public static Predicate<Collection> isCollectionEmpty = collection -> collection.isEmpty();

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
