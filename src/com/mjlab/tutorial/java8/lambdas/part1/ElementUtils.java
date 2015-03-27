package com.mjlab.tutorial.java8.lambdas.part1;

/**
 * Created by ext_marcin.jarzembow on 2015-03-27.
 */
public class ElementUtils {

    public static <E> E betterElement(E e1, E e2, TwoElementPredicate<E> p) {
        return p.compare(e1,e2)? e1: e2;
    }
}
