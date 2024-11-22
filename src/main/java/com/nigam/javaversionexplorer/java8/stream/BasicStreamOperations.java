package com.nigam.javaversionexplorer.java8.stream;

import com.nigam.javaversionexplorer.classes.Student;
import com.nigam.javaversionexplorer.utility.Util;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BasicStreamOperations {
    public static void main(String[] args) {


        List<Student> studentList = Util.getStudentList();
        List<Integer> randomList1 = Util.getRandomNumberList();
        List<Integer> randomList2 = Util.getRandomNumberList();
        int[] randomArray1 = Util.getRandomNumberArray();
        int[] randomArray2 = Util.getRandomNumberArray();
        String randomSentence = Util.generateRandomSentence();


        //Q. Find the Student With highest mark in a list of student using Java streams:
        Optional<Student> studentWithHighestMark = studentList.stream().max(Comparator.comparingInt(student -> student.getMarks()));
        System.out.println("Student With Highest Mark is : " +studentWithHighestMark.get());

        //Q. Find the Average Mark in a list of student using Java streams:
        double averageMark = studentList.stream().mapToInt(Student::getMarks).average().orElse(0);
        System.out.println("Average Mark is : " +averageMark);

        //Q. Check how many students has secured mark with even numbers:
        long numberOfStudentWithEvenNumbers = studentList.stream()
                .mapToInt(Student::getMarks)
                .filter(Util.longPredicate)
                .count();
        System.out.println("Number of students has secured mark with even numbers : " +numberOfStudentWithEvenNumbers);

        //Q. Sort a list
        List<Integer> sortedRandomArrayList1 = randomList1.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Random list1 : " +sortedRandomArrayList1);

        //Q. Merge two sorted list
        List<Integer> mergedAndSortedList = Stream.concat(randomList1.stream(), randomList2.stream())
                .sorted().collect(Collectors.toList());
        System.out.println("Merged and Sorted List : " +mergedAndSortedList);

        //Q. Find Frequency in a scentence
        Map<String, Long> wordFrequencyMap = Arrays.stream(randomSentence.split("\\s+"))  // Split by whitespace
                .map(String::toLowerCase)  // Convert to lowercase to ensure case-insensitivity
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));  // Count frequency
        System.out.println(wordFrequencyMap);
    }
}
