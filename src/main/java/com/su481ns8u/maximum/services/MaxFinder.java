package com.su481ns8u.maximum.services;

import java.util.Arrays;

public class MaxFinder<E extends Comparable> {
    private E[] array;

    public MaxFinder(E[] array) {
        this.array = array;
    }

    public E findMax() {
        Arrays.sort(array);
        E max = array[array.length - 1];
        printMax(max);
        return max;
    }

    private void printMax(E max) {
        System.out.println("Max Element: " + max);
    }
}