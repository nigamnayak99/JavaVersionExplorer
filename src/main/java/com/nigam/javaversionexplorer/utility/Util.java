package com.nigam.javaversionexplorer.utility;

import com.nigam.javaversionexplorer.classes.Student;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntPredicate;
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
    public static Supplier<Student> defaultStudentSupplier = ()-> new Student("Default Student", 100, 0,"Default Registration number");

    public static Optional<Integer> extractMarkFromStudent(Student student) {
        return Optional.of(student.getMarks());
    }
    public static Predicate<Integer> integerPredicate = number -> number % 2 == 0;

    public static IntPredicate longPredicate = number -> number % 2 == 0;

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

    /**
     * Generates an ArrayList of 10 random numbers between 1 and 100.
     * @return List of random integers.
     */
    public static List<Integer> getRandomNumberList() {
        List<Integer> randomNumbers = new ArrayList<>();
        Random random = new Random();
        // Generate 10 random numbers
        for (int i = 0; i < 10; i++) {
            randomNumbers.add(random.nextInt(100) + 1); // Random number between 1 and 100
        }
        return randomNumbers;
    }

    /**
     * Generates an array of 10 random numbers between 1 and 100.
     * @return Array of random integers.
     */
    public static int[] getRandomNumberArray() {
        int[] randomNumbers = new int[10];  // Array of size 10
        Random random = new Random();
        // Generate 10 random numbers
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(100) + 1;  // Random number between 1 and 100
        }
        return randomNumbers;
    }

    /**
     * Generates a random sentence by selecting words from a list. The sentence can have repeated words.
     * @return A random sentence.
     */
    public static String generateRandomSentence() {
        // List of words to form the sentence
        List<String> words = List.of(
                "the", "quick", "brown", "fox", "jumps", "over", "lazy", "dog", "hello", "world",
                "java", "streams", "code", "is", "fun", "have", "a", "great", "day", "my", "friend"
        );

        // Random object to generate random indices
        Random random = new Random();

        // Generate a random length for the sentence (between 5 to 15 words)
        int sentenceLength = random.nextInt(11) + 5; // Between 5 and 15 words

        StringBuilder sentence = new StringBuilder();

        // Construct the sentence
        for (int i = 0; i < sentenceLength; i++) {
            // Randomly pick a word from the list
            String randomWord = words.get(random.nextInt(words.size()));
            // Add the word to the sentence
            sentence.append(randomWord).append(" ");
        }

        // Remove the trailing space
        sentence.setLength(sentence.length() - 1);

        // Capitalize the first letter of the sentence
        sentence.replace(0, 1, sentence.substring(0, 1).toUpperCase());

        // Add a period at the end
        sentence.append(".");

        return sentence.toString();
    }

    public static Supplier<LocalDate> localDateSupplier = () -> LocalDate.now();
    public static Supplier<LocalTime> localTimeSupplier = () -> LocalTime.now();
    public static Supplier<LocalDateTime> localDateTimeSupplier = () -> LocalDateTime.now();
    public static Supplier<ZonedDateTime> zonedDateTimeSupplier = () -> ZonedDateTime.now();
    public static Supplier<OffsetDateTime> offsetDateTimeSupplier = () -> OffsetDateTime.now();
    public static Supplier<Instant> currentInstantSupplier = () -> Instant.now();
    public static List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mly", 85, 20, "A123"));
        students.add(new Student("John", 70, 21, "B456"));
        students.add(new Student("Jane", 90, 19, "C789"));
        students.add(new Student("Tom", 65, 22, "D012"));
        students.add(new Student("Alice", 92, 18, "E345"));
        students.add(new Student("Bob", 75, 23, "F678"));
        students.add(new Student("Charlie", 88, 20, "G901"));
        students.add(new Student("Daisy", 80, 22, "H234"));
        students.add(new Student("Eve", 95, 19, "I567"));
        students.add(new Student("Frank", 60, 24, "J890"));
        students.add(new Student("Grace", 89, 21, "K123"));
        students.add(new Student("Hannah", 78, 20, "L456"));
        students.add(new Student("Ian", 84, 22, "M789"));
        students.add(new Student("Jack", 72, 21, "N012"));
        students.add(new Student("Kelly", 91, 20, "O345"));

        return students;
    }
}
