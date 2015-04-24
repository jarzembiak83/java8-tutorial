package com.mjlab.tutorial.java8.lambdas.part3;

import com.mjlab.tutorial.java8.lambdas.common.FunctionUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ext_marcin.jarzembow on 2015-03-27.
 */
public class LambdaExcercisesPart3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("o", "assosssss", "btoyyy", "rty", "12ty", "edddd", "acvvv", "oooo");
        System.out.println("Initial strings array");
        System.out.println(words);

        String firstAllMatch = FunctionUtils.firstAllMatch(words.stream(),
                s -> s.contains("o"),
                s -> s.length() > 5);
        System.out.println("firstAllMatch");
        System.out.println(firstAllMatch);

        String firstAnyMatch =  FunctionUtils.firstAnyMatch(words.stream(),
                s -> s.contains("o"),
                s -> s.length() > 5);
        System.out.println("firstAnyMatch");
        System.out.println(firstAnyMatch);
    }
}
