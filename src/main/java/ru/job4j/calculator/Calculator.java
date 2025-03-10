package ru.job4j.calculator;

public class Calculator {
    private static int x = 5;

    public static void main(String[] args) {

        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;

        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;

        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);

        Calculator calculator = new Calculator();

        int sum = sum(5);
        int minus = minus(4);
        int devided = calculator.devide(5);
        int multiplied = calculator.multiply(5);
        double sao = calculator.sumAllOperation(sum, minus, devided, multiplied);
        System.out.println(sao);

    }

    private static int sum(int y) {
        return x + y;
    }

    private static int minus(int y) {
        return x - y;
    }

    private int devide(int y) {
        return y / x;
    }

    private int multiply(int y) {
        return x * y;
    }

    private double sumAllOperation(int sum,
                                   int minus,
                                   int devide,
                                   int multiply) {
        return sum + minus + devide + multiply;
    }
}
