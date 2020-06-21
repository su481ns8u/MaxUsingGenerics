package com.su481ns8u.maximum.services;

import org.junit.Assert;
import org.junit.Test;

public class MaxFinderTest {
    MaxFinder maxFinder;

    @Test
    public void findMaxForInteger_ShouldPass_IfMaxGivenAtFirstPosition() {
        Integer[] intArray = {10, 8, 5};
        maxFinder = new MaxFinder(intArray);
        int max = maxFinder.findMax();
        Assert.assertEquals(10, max);
    }


}
