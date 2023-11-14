package ru.job4j.condition;


import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2And3Then3() {
        int left = 1;
        int right = 2;
        int up = 3;
        int result = Max.max(left, right, up);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To10And50And100Then100() {
        int left = 5;
        int right = 10;
        int up = 50;
        int down = 100;
        int result = Max.max(left, right, up, down);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax13To25Then25() {
        int left = 13;
        int right = 25;
        int result = Max.max(left, right);
        int expected = 25;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax3To1Then3() {
        int left = 1;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 3;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax5To5Then5() {
        int left = 5;
        int right = 5;
        int result = Max.max(left, right);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}