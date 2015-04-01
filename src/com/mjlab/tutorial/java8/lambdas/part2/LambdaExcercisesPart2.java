package com.mjlab.tutorial.java8.lambdas.part2;

import com.mjlab.tutorial.java8.lambdas.common.ElementUtils;
import com.mjlab.tutorial.java8.lambdas.common.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ext_marcin.jarzembow on 2015-03-27.
 */
public class LambdaExcercisesPart2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("asssssss", "btyyy", "rty", "12ty", "edddd", "acvvv");
        System.out.println("Initial strings array");
        System.out.println(words);

        List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
        System.out.println("s -> s.length() < 4");
        System.out.println(shortWords);

        List<String> wordsWithB = StringUtils.allMatches(words,  s -> s.contains("b"));
        System.out.println("s -> s.contains(\"b\")");
        System.out.println(wordsWithB);

        List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
        System.out.println(" s -> (s.length() % 2) == 0");
        System.out.println(evenLengthWords);

        List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
        System.out.println("Initial nums array");
        System.out.println(nums);

        List<Integer> bigNums = ElementUtils.allMatches(nums, n -> n > 500);
        System.out.println(" n -> n>500");
        System.out.println(bigNums);

        List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
        System.out.println("s -> s + \"!\"");
        System.out.println(excitingWords);

        List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
        System.out.println("s -> s.replace(\"i\", \"eye\")");
        System.out.println(eyeWords);

        List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
        System.out.println("String::toUpperCase");
        System.out.println(upperCaseWords);

        List<Integer> wordLengths = ElementUtils.transformedList(words, String::length);
        System.out.println("String::length");
        System.out.println(wordLengths);


    }
}
