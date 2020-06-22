package com.su481ns8u.maximum.services;

import java.util.Arrays;

/**
 * Class extends generic Comparable
 * It finds and prints the max element
 * @param <E>
 */
public class MaxFinder<E extends Comparable> {
    private E[] array;

    /* Constructor */
    public MaxFinder(E... args) {
        this.array = args;
    }

    /* Find and return max */
    public E findMax() {
        if (array.length <= 0) {
            System.out.println("No Arguments Passed !");
            return null;
        } else {
            Arrays.sort(array);
            E max = array[array.length - 1];
            printMax(max);
            return max;
        }
    }

    /* Prints max of all arguments */
    private void printMax(E max) {
        System.out.println("Max Element: " + max);
    }
}