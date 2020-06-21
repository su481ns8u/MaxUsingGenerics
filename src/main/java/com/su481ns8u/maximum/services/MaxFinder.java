package com.su481ns8u.maximum.services;

import java.util.Arrays;

public class MaxFinder<E extends Comparable> {
    E[] array;

    public MaxFinder(E[] array) {
        this.array = array;
    }

    public E findMax() {
        Arrays.sort(array);
        E max = array[array.length - 1];
        return max;
    }
}