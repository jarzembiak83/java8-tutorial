package com.mjlab.tutorial.java8.lambdas.common;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by ext_marcin.jarzembow on 2015-04-01.
 */
public class FunctionUtils {

    private static <T> Predicate<T> allPassPredicate(Predicate<T>... p) {
        Predicate<T> result = t -> true;

        for (Predicate<T> predicate : p) {
            result = result.and(predicate);
        }

        return result;
    }

    private static <T> Predicate<T> anyPassPredicate(Predicate<T>... p) {
        Predicate<T> result = t -> false;

        for (Predicate<T> predicate : p) {
            result = result.or(predicate);
        }

        return result;
    }

    public static <T> T firstAllMatch(Stream<T> s, Predicate<T>... p) {
        return s.filter(allPassPredicate(p)).findFirst().get();
    }

    public static <T> T firstAnyMatch(Stream<T> s, Predicate<T>... p) {
        return s.filter(anyPassPredicate(p)).findFirst().get();
    }
}
