package com.mjlab.tutorial.java8.streams.part1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ext_marcin.jarzembow on 2015-04-24.
 */
public class StreamExcercisesPart1 {

    private static final List<String> words = Arrays.asList("hi", "hello", "yes", "erq", "me", "abc", "123");

    public static void main(String[] args) {

        System.out.println("Each word in separate line with two spaces before.");
        words.forEach(s -> System.out.println("  " + s));

        System.out.println("Each word in separate line without two spaces before.");
        words.forEach(System.out::println);

        System.out.println("excitingWords - add ! at the end");
        List<String> excitingWords = words.stream().map(s -> s + "!").collect(Collectors.toList());
        excitingWords.forEach(System.out::println);

        System.out.println("eyeWords - replace every i with eye");
        List<String> eyeWords = words.stream().map(s -> s.replace("i", "eye")).collect(Collectors.toList());
        eyeWords.forEach(System.out::println);

        System.out.println("upperCaseWords - make all words upperCase");
        List<String> upperCaseWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        upperCaseWords.forEach(System.out::println);

        System.out.println("shortWords - words shorter than 4 signs");
        List<String> shortWords = words.stream().filter(s -> s.length() < 4).collect(Collectors.toList());
        shortWords.forEach(System.out::println);

        System.out.println("wordsWithB - words which contains letter b");
        List<String> wordsWithB = words.stream().filter(s -> s.contains("b")).collect(Collectors.toList());
        wordsWithB.forEach(System.out::println);

        System.out.println("evenLengthWords - words which have even length");
        List<String> evenLengthWords = words.stream().filter(s ->  (s.length() % 2) == 0).collect(Collectors.toList());
        evenLengthWords.forEach(System.out::println);

        System.out.println("Turn the strings into uppercase, keep only the ones that are shorter than 4 characters, of what\n" +
                "is remaining, keep only the ones that contain “e”, and print the first result: ");
        String wordWithE = getFunnyWord(words, "E");
        System.out.println("Uppercase short word with 'E': " + wordWithE);
        String wordWithQ = getFunnyWord(words, "Q");
        System.out.println("Uppercase short word with 'Q': " + wordWithQ);

        Function<String,String> toUpper = s -> { System.out.println("Uppercasing " + s);
            return(s.toUpperCase());
        };

        System.out.println("Starting lazy evaluation test...");
        String lazyEvaluationTestResult = words.stream()
                .map(toUpper)
                .filter(s -> s.length() < 4)
                .filter(s -> s.contains("Q"))
                .findFirst().orElse("NOT FOUND");
        System.out.println("lazyEvaluationTestResult: " + lazyEvaluationTestResult);


        String[] wordsWithBAsArray = words.stream().filter(s -> s.contains("b")).toArray(String[]::new);
        Stream.of(wordsWithBAsArray).forEach(System.out::println);
    }

    private static String getFunnyWord(List<String> coll, String letter) {
        return coll.stream().map(String::toUpperCase).filter(s -> s.length() < 4).filter(s-> s.contains(letter)).findFirst().orElse("NOT FOUND");
    }

}
