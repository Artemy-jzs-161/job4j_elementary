package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortTree() {
        int[] data = new int[]{6, 9, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{3, 6, 9};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortFive() {
        int[] data = new int[]{96, 14, 51, 12, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{5, 12, 14, 51, 96};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortFour() {
        int[] data = new int[]{14, 1, 5, 20};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 5, 14, 20};
        Assert.assertArrayEquals(expected, result);
    }
}