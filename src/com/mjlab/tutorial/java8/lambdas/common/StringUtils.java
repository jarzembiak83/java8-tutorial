package com.mjlab.tutorial.java8.lambdas.common;

import com.mjlab.tutorial.java8.lambdas.part1.TwoStringPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by ext_marcin.jarzembow on 2015-03-27.
 */
public class StringUtils {

    public static int WithELetterFirst(String s1, String s2) { int compareFlag = 0;
        if (s1.contains("e") && !s2.contains("e")) {
            compareFlag = -1;
        } else if(s2.contains("e") && !s1.contains("e")) {
            compareFlag = 1;
        }
        return(compareFlag);
    }

    public static String betterString(String s1, String s2, TwoStringPredicate p) {
        return p.compare(s1,s2)?s1: s2;
    }

    public static List<String> allMatches(List<String> list, Predicate<String> p) {
        List<String> result = new ArrayList<String>();
        for (String e : list) {
            if (p.test(e)){
                result.add(e);
            }
        }
        return result;
    }

    public static List<String> transformedList(List<String> input, Function<String,String> transformation) {
        List<String> result = new ArrayList<String>();
        for (String e : input) {
            result.add(transformation.apply(e));
        }
        return result;
    }
}
