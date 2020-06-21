package com.su481ns8u.maximum.services;

public class MaxFinder {
    Integer[] intArray;
    Float[] floatArray;

    public MaxFinder(Integer[] intArray) {
        this.intArray = intArray;
    }

    public MaxFinder(Float[] floatArray){
        this.floatArray = floatArray;
    }

    public Integer findMaxInt() {
        Integer max = intArray[0];
        for (Integer i : intArray)
            if (i.compareTo(max) > 0)
                max = i;
        return max;
    }

    public Float findMaxFloat() {
        Float max = floatArray[0];
        for (Float i : floatArray)
            if (i.compareTo(max) > 0)
                max = i;
        return max;
    }
}