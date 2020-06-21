package com.su481ns8u.maximum.services;

import org.junit.Assert;
import org.junit.Test;

public class MaxFinderTest {
    MaxFinder maxFinder;

    @Test
    public void findMaxForInteger_ShouldPass_IfMaxGivenAtFirstPosition() {
        Integer[] intArray = {10, 8, 5};
        maxFinder = new MaxFinder(intArray);
        Integer max = maxFinder.findMaxInt();
        Assert.assertEquals(intArray[0], max);
    }

    @Test
    public void findMaxForInteger_ShouldPass_IfMaxGivenAtSecondPosition() {
        Integer[] intArray = {8, 10, 5};
        maxFinder = new MaxFinder(intArray);
        Integer max = maxFinder.findMaxInt();
        Assert.assertEquals(intArray[1], max);
    }

    @Test
    public void findMaxForInteger_ShouldPass_IfMaxGivenAtThirdPosition() {
        Integer[] intArray = {8, 5, 10};
        maxFinder = new MaxFinder(intArray);
        Integer max = maxFinder.findMaxInt();
        Assert.assertEquals(intArray[2], max);
    }

    @Test
    public void findMaxForFloat_ShouldPass_IfMaxGivenAtFirstPosition() {
        Float[] floatArray = {10.3f, 8.5f, 5.1f};
        maxFinder = new MaxFinder(floatArray);
        Float max = maxFinder.findMaxFloat();
        Assert.assertEquals(floatArray[0], max);
    }

    @Test
    public void findMaxForFloat_ShouldPass_IfMaxGivenAtSecondPosition() {
        Float[] floatArray = {10.3f, 15.5f, 5.1f};
        maxFinder = new MaxFinder(floatArray);
        Float max = maxFinder.findMaxFloat();
        Assert.assertEquals(floatArray[1], max);
    }

    @Test
    public void findMaxForFloat_ShouldPass_IfMaxGivenAtThirdPosition() {
        Float[] floatArray = {10.3f, 15.5f, 52.1f};
        maxFinder = new MaxFinder(floatArray);
        Float max = maxFinder.findMaxFloat();
        Assert.assertEquals(floatArray[2], max);
    }

    @Test
    public void findMaxForString_ShouldPass_IfMaxGivenAtFirstPosition() {
        String[] stringArray = {"ShantnuNaik", "SandeepGhi", "SadhanaJoshi"};
        maxFinder = new MaxFinder(stringArray);
        String max = maxFinder.findMaxString();
        Assert.assertEquals(stringArray[0], max);
    }
}
