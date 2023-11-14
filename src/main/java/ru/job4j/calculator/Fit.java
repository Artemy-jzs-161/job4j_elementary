package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15d;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15d;
    }

    public static void main(String[] args) {
        double man = Fit.manWeight((short) 187);
        double woman = Fit.womanWeight((short) 175);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 175 is " + woman);
    }

}