package com.mjlab.tutorial.java8.lambdas.part3;

import com.mjlab.tutorial.java8.lambdas.common.ElementUtils;
import com.mjlab.tutorial.java8.lambdas.common.FunctionUtils;
import com.mjlab.tutorial.java8.lambdas.common.StringUtils;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ext_marcin.jarzembow on 2015-03-27.
 */
public class LambdaExcercisesPart3 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("assosssss", "btoyyy", "rty", "12ty", "edddd", "acvvv", "oooo");
        System.out.println("Initial strings array");
        System.out.println(words);

        String firstMatch = FunctionUtils.firstAllMatch(words.stream(),
                s -> s.contains("o"),
                s -> s.length() > 5);
        System.out.println(firstMatch);
    }
}
