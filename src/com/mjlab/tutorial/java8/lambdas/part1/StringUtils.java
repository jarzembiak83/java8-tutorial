package com.mjlab.tutorial.java8.lambdas.part1;

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
}
