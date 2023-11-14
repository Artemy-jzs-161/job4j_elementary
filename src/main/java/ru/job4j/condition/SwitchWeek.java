package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String nameDay;
        switch (day) {
            case 1:
                nameDay = "Понедельник";
                break;
            case 2:
                nameDay = "Вторник";
                break;
            case 3:
                nameDay = "Среда";
                break;
            case 4:
                nameDay = "Четверг";
                break;
            case 5:
                nameDay = "Пятница";
                break;
            case 6:
                nameDay = "Суббота";
                break;
            case 7:
                nameDay = "Воскресенье";
                break;
            default:
                nameDay = "Ошибка";
                break;
        }
        return nameDay;
    }

    public static void main(String[] args) {
        System.out.println(SwitchWeek.nameOfDay(1));
        System.out.println(SwitchWeek.nameOfDay(2));
        System.out.println(SwitchWeek.nameOfDay(3));
        System.out.println(SwitchWeek.nameOfDay(4));
        System.out.println(SwitchWeek.nameOfDay(5));
        System.out.println(SwitchWeek.nameOfDay(6));
        System.out.println(SwitchWeek.nameOfDay(7));
        System.out.println(SwitchWeek.nameOfDay(8));
    }
}