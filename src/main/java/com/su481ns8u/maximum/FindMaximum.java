package com.su481ns8u.maximum;
import com.su481ns8u.maximum.services.MaxFinder;

public class FindMaximum {
    public static void main(String[] args) {
        Integer[] intArray = {10, 5, 6};
        MaxFinder maxFinder = new MaxFinder(intArray);
        int max = maxFinder.findMax();
        System.out.println("Max: "+max);
    }
}
