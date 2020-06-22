package com.su481ns8u.maximum.services;

import org.junit.Assert;
import org.junit.Test;

public class MaxFinderTest {
    @Test
    public void findMaxForInteger_ShouldPass_IfMaxGivenAtFirstPosition() {
        Assert.assertEquals(10, new MaxFinder(10, 8, 5).findMax());
    }

    @Test
    public void findMaxForInteger_ShouldPass_IfMaxGivenAtSecondPosition() {
        Assert.assertEquals(10, new MaxFinder(8, 10, 5).findMax());
    }

    @Test
    public void findMaxForInteger_ShouldPass_IfMaxGivenAtThirdPosition() {
        Assert.assertEquals(10, new MaxFinder(8, 5, 10).findMax());
    }

    @Test
    public void findMaxForFloat_ShouldPass_IfMaxGivenAtFirstPosition() {
        Assert.assertEquals(10.3f, new MaxFinder(10.3f, 8.5f, 5.1f).findMax());
    }

    @Test
    public void findMaxForFloat_ShouldPass_IfMaxGivenAtSecondPosition() {
        Assert.assertEquals(15.5f, new MaxFinder(10.3f, 15.5f, 5.1f).findMax());
    }

    @Test
    public void findMaxForFloat_ShouldPass_IfMaxGivenAtThirdPosition() {
        Assert.assertEquals(52.1f, new MaxFinder(10.3f, 15.5f, 52.1f).findMax());
    }

    @Test
    public void findMaxForString_ShouldPass_IfMaxGivenAtFirstPosition() {
        Assert.assertEquals("ShantnuNaik", new MaxFinder("ShantnuNaik", "SandeepGhi", "SadhanaJoshi")
                .findMax());
    }

    @Test
    public void findMaxForString_ShouldPass_IfMaxGivenAtSecondPosition() {
        Assert.assertEquals("ShantnuNaik", new MaxFinder("SandeepGhi", "ShantnuNaik", "SadhanaJoshi")
                .findMax());
    }

    @Test
    public void findMaxForString_ShouldPass_IfMaxGivenAtThirdPosition() {
        Assert.assertEquals("ShantnuNaik", new MaxFinder("SandeepGhi", "SadhanaJoshi", "ShantnuNaik")
                .findMax());
    }

    @Test
    public void findMax_ShouldReturnNullAndGiveMessage_IfNoArgumentsArePassed() {
        Assert.assertEquals(null, new MaxFinder().findMax());
    }
}