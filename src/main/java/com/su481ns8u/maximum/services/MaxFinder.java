package com.su481ns8u.maximum.services;

public class MaxFinder<E extends Comparable> {
    E[] array;

    public MaxFinder(E[] array) {
        this.array = array;
    }

    public E findMax() {
        E max = array[0];
        for (E i : array)
            if (i.compareTo(max) > 0)
                max = i;
        return max;
    }
}