package com.su481ns8u.maximum.services;

import org.junit.Assert;
import org.junit.Test;

public class MaxFinderTest<E extends Comparable> {
    @Test
    public <E extends Comparable> void findMaxForInteger_ShouldPass_IfMaxGivenAtFirstPosition() {
        Integer[] intArray = {10, 8, 5};
        MaxFinder maxFinderInt = new MaxFinder(intArray);
        E maxInt = (E) maxFinderInt.findMax();
        Assert.assertEquals(intArray[0], maxInt);
    }

    @Test
    public <E extends Comparable> void findMaxForFloat_ShouldPass_IfMaxGivenAtFirstPosition() {
        Float[] floatArray = {5.2f, 8.3f, 9.1f};
        MaxFinder maxFinderFloat = new MaxFinder(floatArray);
        E maxFloat = (E) maxFinderFloat.findMax();
        Assert.assertEquals(floatArray[2], maxFloat);
    }

    @Test
    public <E extends Comparable> void findMaxForString_ShouldPass_IfMaxGivenAtFirstPosition() {
        String[] stringArray = {"Sudhanshu", "Snehal", "Shashank"};
        MaxFinder maxFinderString = new MaxFinder(stringArray);
        E maxString = (E) maxFinderString.findMax();
        Assert.assertEquals(stringArray[0], maxString);
    }
}
