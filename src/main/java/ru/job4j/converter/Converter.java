package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        int inRubToDoll = 140;
        int expectedRubToDoll = 2;
        int outRubToDoll = Converter.rubleToDollar(inRubToDoll);
        boolean passedRubToDoll = expectedRubToDoll == outRubToDoll;
        System.out.println("140 rubles are 2 dollar. Test result : " + passedRubToDoll);

    }
}
