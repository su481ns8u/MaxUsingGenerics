package com.su481ns8u.maximum;

import com.su481ns8u.maximum.services.MaxFinder;

public class FindMaximum {
    public static void main(String[] args) {
        Integer[] intArray = {10, 5, 6};
        Float[] floatArray = {5.2f, 8.3f, 9.1f};
        String[] stringArray = {"Sudhanshu", "Snehal", "Shashank"};

        MaxFinder maxFinderInt = new MaxFinder(intArray);
        MaxFinder maxFinderFloat = new MaxFinder(floatArray);
        MaxFinder maxFinderString = new MaxFinder(stringArray);

        Integer maxInt = maxFinderInt.findMaxInt();
        Float maxFloat = maxFinderFloat.findMaxFloat();
        String maxString = maxFinderString.findMaxString();

        System.out.println("Max Int: " + maxInt);
        System.out.println("Max Float: " + maxFloat);
        System.out.println("Max String: " + maxString);
    }
}
