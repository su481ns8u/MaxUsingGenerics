package com.su481ns8u.maximum;

import com.su481ns8u.maximum.services.MaxFinder;

public class FindMaximum {
    public static void main(String[] args) {
        new MaxFinder(2, 10, 5, 6).findMax();
        new MaxFinder(15.0f, 5.2f, 8.3f, 9.1f).findMax();
        new MaxFinder("Big", "Sudhanshu", "Snehal", "Shashank").findMax();
    }
}
