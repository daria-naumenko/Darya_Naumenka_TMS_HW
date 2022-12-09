package by.naumenka.lesson10.task1;

public class Document {

    public static void firstMethod(String text) {
        System.out.println("Вывели в одну строку два первых блока по 4 цифры: "
                + text.substring(0, 4)
                + text.substring(9, 13));
    }

    public static void secondMethod(String text) {
        System.out.println("Заменили буквы на *: "
                + text.replaceAll("[a-zA-Z]", "*"));
    }

    public static void thirdMethod(String text) {
        System.out.println(("Вывели буквы в формате yyy/yyy/y/y в нижнем регистре "
                + text.substring(5, 8)
                + "/" + text.substring(14, 17)
                + "/" + text.substring(19, 20)
                + "/" + text.substring(21).toLowerCase()));
    }

    public static void fourthMethod(String text) {
        StringBuilder stringBuilder = new StringBuilder("\"Letters: ");
        stringBuilder.append((text.substring(5, 8)
                + "/" + text.substring(14, 17)
                + "/" + text.charAt(19) +
                "/" + text.charAt(21)).toUpperCase()).append("\"");
        System.out.println("Вывели буквы в формате Letters:yyy/yyy/y/y в верхнем регистре " + stringBuilder);
    }

    public static void fifthMethod(String text) {
        text = text.toUpperCase();
        if (text.contains("ABC")) {
            System.out.println("Да, строка содержит ABC");
        } else {
            System.out.println("Нет, строка не содержит ABC");
        }
    }

    public static void sixthMethod(String text) {
        if (text.startsWith("555")) {
            System.out.println("Да, строка начинается с 555");
        } else {
            System.out.println("Нет, строка не начинается 555");
        }
    }

    public static void seventhMethod(String text) {
        if (text.endsWith("1a2b")) {
            System.out.println("Да, строка заканчивается на 1a2b");
        } else {
            System.out.println("Нет, строка не заканчивается 1a2b");
        }
    }
}