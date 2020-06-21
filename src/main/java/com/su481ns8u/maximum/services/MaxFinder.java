package com.su481ns8u.maximum.services;

public class MaxFinder {
    Integer[] intArray;

    public MaxFinder(Integer[] intArray) {
        this.intArray = intArray;
    }

    public int findMax() {
        int max = intArray[0];
        for (Integer i : intArray)
            if (i.compareTo(max) > 0)
                max = i;
        return max;
    }
}