package com.mjlab.tutorial.java8.lambdas.common;

import com.mjlab.tutorial.java8.lambdas.part1.TwoElementPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by ext_marcin.jarzembow on 2015-03-27.
 */
public class ElementUtils {

    public static <E> E betterElement(E e1, E e2, TwoElementPredicate<E> p) {
        return p.compare(e1, e2) ? e1 : e2;
    }

    public static <E> List<E> allMatches(List<E> list, Predicate<E> p) {
        List<E> result = new ArrayList<E>();
        for (E e : list) {
            if (p.test(e)) {
                result.add(e);
            }
        }
        return result;
    }

    public static <I,O> List<O> transformedList(List<I> input, Function<I, O> transformation) {
        List<O> result = new ArrayList<O>();
        for (I e : input) {
            result.add(transformation.apply(e));
        }
        return result;
    }

}