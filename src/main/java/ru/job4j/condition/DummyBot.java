package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {

        String rsl = "I don't know. Please, ask another question.";

        if ("Hi, Bot.".equals(question)) {
            /* заменить ... на правильный ответ rsl = "ответ по заданию". */
            rsl = "Hi, SmartAss.";
        } else if ("Bye.".equals(question)) { /* заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить. */
            /* заменить ... на правильный ответ rsl = "ответ по заданию". */
            rsl = "See you later.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Hi, Bot.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Bye.");
        System.out.println(rsl);
    }
}

