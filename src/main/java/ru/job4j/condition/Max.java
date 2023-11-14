package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int up) {
        return max(up, max(left, right));
    }

    public static int max(int left, int right, int up, int down) {
        return max(up, down, max(left, right));
    }

    public static void main(String[] args) {
        int msg = Max.max(5, 10, 50, 100);
        System.out.println(msg);
    }

}
