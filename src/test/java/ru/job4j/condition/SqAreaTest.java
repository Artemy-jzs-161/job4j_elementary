package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1Square2() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K3Square2() {
        double expected = 113.37;
        int p = 100;
        double k = 20;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

}