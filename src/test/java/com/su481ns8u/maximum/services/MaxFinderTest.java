package com.su481ns8u.maximum.services;

import org.junit.Assert;
import org.junit.Test;

public class MaxFinderTest<E extends Comparable> {
    MaxFinder maxFinder;

    @Test
    public void findMaxForInteger_ShouldPass_IfMaxGivenAtFirstPosition() {
        Integer[] intArray = {10, 8, 5};
        maxFinder = new MaxFinder(intArray);
        Integer max = (Integer) maxFinder.findMax();
        Assert.assertEquals(intArray[0], max);
    }

    @Test
    public void findMaxForInteger_ShouldPass_IfMaxGivenAtSecondPosition() {
        Integer[] intArray = {8, 10, 5};
        maxFinder = new MaxFinder(intArray);
        Integer max = (Integer) maxFinder.findMax();
        Assert.assertEquals(intArray[1], max);
    }

    @Test
    public void findMaxForInteger_ShouldPass_IfMaxGivenAtThirdPosition() {
        Integer[] intArray = {8, 5, 10};
        maxFinder = new MaxFinder(intArray);
        Integer max = (Integer) maxFinder.findMax();
        Assert.assertEquals(intArray[2], max);
    }

    @Test
    public void findMaxForFloat_ShouldPass_IfMaxGivenAtFirstPosition() {
        Float[] floatArray = {10.3f, 8.5f, 5.1f};
        maxFinder = new MaxFinder(floatArray);
        Float max = (Float) maxFinder.findMax();
        Assert.assertEquals(floatArray[0], max);
    }

    @Test
    public void findMaxForFloat_ShouldPass_IfMaxGivenAtSecondPosition() {
        Float[] floatArray = {10.3f, 15.5f, 5.1f};
        maxFinder = new MaxFinder(floatArray);
        Float max = (Float) maxFinder.findMax();
        Assert.assertEquals(floatArray[1], max);
    }

    @Test
    public void findMaxForFloat_ShouldPass_IfMaxGivenAtThirdPosition() {
        Float[] floatArray = {10.3f, 15.5f, 52.1f};
        maxFinder = new MaxFinder(floatArray);
        Float max = (Float) maxFinder.findMax();
        Assert.assertEquals(floatArray[2], max);
    }

    @Test
    public void findMaxForString_ShouldPass_IfMaxGivenAtFirstPosition() {
        String[] stringArray = {"ShantnuNaik", "SandeepGhi", "SadhanaJoshi"};
        maxFinder = new MaxFinder(stringArray);
        String max = (String) maxFinder.findMax();
        System.out.println(max);
        Assert.assertEquals(stringArray[0], max);
    }

    @Test
    public void findMaxForString_ShouldPass_IfMaxGivenAtSecondPosition() {
        String[] stringArray = {"SandeepGhi", "ShantnuNaik", "SadhanaJoshi"};
        maxFinder = new MaxFinder(stringArray);
        String max = (String) maxFinder.findMax();
        Assert.assertEquals(stringArray[1], max);
    }

    @Test
    public void findMaxForString_ShouldPass_IfMaxGivenAtThirdPosition() {
        String[] stringArray = {"SandeepGhi", "SadhanaJoshi", "ShantnuNaik"};
        maxFinder = new MaxFinder(stringArray);
        String max = (String) maxFinder.findMax();
        Assert.assertEquals(stringArray[2], max);
    }
}
