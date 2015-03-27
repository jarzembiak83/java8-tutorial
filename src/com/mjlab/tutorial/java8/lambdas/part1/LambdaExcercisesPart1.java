package com.mjlab.tutorial.java8.lambdas.part1;

import com.mjlab.tutorial.java8.lambdas.part1.ElementUtils;
import com.mjlab.tutorial.java8.lambdas.part1.StringUtils;

import java.util.Arrays;

/**
 * Created by ext_marcin.jarzembow on 2015-03-27.
 */
public class LambdaExcercisesPart1 {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"asssssss", "btyyy", "rty", "12ty", "edddd" , "acvvv"};

        System.out.println("Initial array");
        System.out.println(Arrays.asList(arrayOfStrings));

        Arrays.sort(arrayOfStrings, (a, b) -> a.length() - b.length());
        System.out.println("Array sorted by  length (i.e., shortest to longest)");
        System.out.println(Arrays.asList(arrayOfStrings));

        Arrays.sort(arrayOfStrings, (a, b) -> b.length() - a.length());
        System.out.println("Array sorted by reverse length (i.e., longest to shortest)");
        System.out.println(Arrays.asList(arrayOfStrings));

        Arrays.sort(arrayOfStrings, (a, b) -> a.charAt(0) - b.charAt(0));
        System.out.println("Array sorted alphabetically by the first character only");
        System.out.println(Arrays.asList(arrayOfStrings));

        Arrays.sort(arrayOfStrings, StringUtils::WithELetterFirst);
        System.out.println("Array sorted by strings that contain “e” first, everything else second");
        System.out.println(Arrays.asList(arrayOfStrings));

        String resultTrue = StringUtils.betterString("true", "false", (s1, s2) -> true);
        System.out.println("resultTrue = " + resultTrue);
        String resultFalse = StringUtils.betterString("true", "false", (s1, s2) -> false);
        System.out.println("resultFalse = " + resultFalse);


        String resultTrueElement = ElementUtils.betterElement("trueElement", "falseElement", (s1, s2) -> true);
        System.out.println("resultTrueElement = " + resultTrueElement);
        String resultFalseElement = ElementUtils.betterElement("trueElement", "falseElement", (s1, s2) -> false);
        System.out.println("resultFalseElement = " + resultFalseElement);
    }
}
