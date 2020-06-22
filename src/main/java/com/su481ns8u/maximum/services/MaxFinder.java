package com.su481ns8u.maximum.services;

import java.util.Arrays;

public class MaxFinder<E extends Comparable> {
    private E[] array;

    public MaxFinder(E... args) {
        this.array = args;
    }

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

    private void printMax(E max) {
        System.out.println("Max Element: " + max);
    }
}