package com.su481ns8u.maximum;

import com.su481ns8u.maximum.services.MaxFinder;

public class FindMaximum {
    public static void main(String[] args) {
        Comparable[] intArray = {10, 5, 6};
        Comparable[] floatArray = {5.2f, 8.3f, 9.1f};
        Comparable[] stringArray = {"Sudhanshu", "Snehal", "Shashank"};

        MaxFinder maxFinder = new MaxFinder(intArray);
        Comparable max = maxFinder.findMax();
        System.out.println("Max Int: " + max);

        maxFinder = new MaxFinder(floatArray);
        max = maxFinder.findMax();
        System.out.println("Max Float: " + max);

        maxFinder = new MaxFinder(stringArray);
        max = maxFinder.findMax();
        System.out.println("Max String: " + max);
    }
}
