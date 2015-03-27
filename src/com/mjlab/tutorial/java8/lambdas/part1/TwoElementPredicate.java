package com.mjlab.tutorial.java8.lambdas.part1;

/**
 * Created by ext_marcin.jarzembow on 2015-03-27.
 */
@FunctionalInterface
public interface TwoElementPredicate<L> {

    boolean compare(L s1, L s2);
}
