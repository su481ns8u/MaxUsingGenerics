package com.su481ns8u.maximum;

import com.su481ns8u.maximum.services.MaxFinder;

public class FindMaximum {
    static MaxFinder maxFinder;
    static Comparable[] array;

    public static void main(String[] args) {
        array = new Comparable[]{2, 10, 5, 6};
        maxFinder = new MaxFinder(array);
        maxFinder.findMax();

        array = new Comparable[]{15.0f, 5.2f, 8.3f, 9.1f};
        maxFinder = new MaxFinder(array);
        maxFinder.findMax();

        array = new Comparable[]{"Big", "Sudhanshu", "Snehal", "Shashank"};
        maxFinder = new MaxFinder(array);
        maxFinder.findMax();
    }
}
