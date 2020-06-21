package com.su481ns8u.maximum.services;

import org.junit.Assert;
import org.junit.Test;

public class MaxFinderTest {
    MaxFinder maxFinder;

    @Test
    public void findMaxForInteger_ShouldPass_IfMaxGivenAtFirstPosition() {
        Integer[] intArray = {10, 8, 5};
        maxFinder = new MaxFinder(intArray);
        Integer max = maxFinder.findMax();
        Assert.assertEquals(intArray[0], max);
    }

    @Test
    public void findMaxForInteger_ShouldPass_IfMaxGivenAtSecondPosition() {
        Integer[] intArray = {8, 10, 5};
        maxFinder = new MaxFinder(intArray);
        Integer max = maxFinder.findMax();
        Assert.assertEquals(intArray[1], max);
    }
}
