package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas9Then1() {
        int[] data = {5, 9, 3, 2, 5, 6, 10, 50};
        int el = 9;
        int result = FindLoop.indexOf(data, el);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas6Then1() {
        int[] data = {5, 9, 3, 2, 5, 6, 10, 50};
        int el = 6;
        int result = FindLoop.indexOf(data, el);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void findMissingNumber100() {
        int[] data = {5, 9, 3, 11, 30};
        int el = 100;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void findMissingNumber4() {
        int[] data = {1, 2, 3, 5, 6};
        int el = 4;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[]{5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFind7() {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int el = 7;
        int start = 3;
        int finish = 8;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFind11() {
        int[] data = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int el = 11;
        int start = 0;
        int finish = 8;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}