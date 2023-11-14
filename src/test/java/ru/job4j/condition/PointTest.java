package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when000to026then632() {
        double expected = 6.32;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 2, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when002to246then60() {
        double expected = 6.0;
        Point a = new Point(0, 0, 2);
        Point b = new Point(2, 4, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to20then2() {
        int expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1130to2040then27() {
        double expected = 27.58;
        Point a = new Point(11, 20);
        Point b = new Point(30, 40);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when56to78then2() {
        double expected = 1.41;
        Point a = new Point(5, 7);
        Point b = new Point(6, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when1112to1992then2() {
        int expected = 73;
        Point a = new Point(11, 19);
        Point b = new Point(12, 92);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}