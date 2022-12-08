package by.naumenka.task1;

import by.naumenka.task1.Exception.ContainsABCException;
import by.naumenka.task1.Exception.End1a2bException;
import by.naumenka.task1.Exception.Start555Exception;

import static by.naumenka.task1.Exception.ContainsABCException.DESCRIPTION2;
import static by.naumenka.task1.Exception.End1a2bException.DESCRIPTION3;
import static by.naumenka.task1.Exception.Start555Exception.DESCRIPTION;

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

    public static void fifthMethod(String text) throws ContainsABCException {
        text = text.toUpperCase();
        try {
        if (text.contains("ABC")) {
            throw new ContainsABCException("ИСКЛЮЧЕНИЕ ");
        }
        } catch (ContainsABCException ex) {
            System.out.println(ex.getMessage() + DESCRIPTION2);
        }
    }


    public static void sixthMethod(String text) throws Start555Exception {
        try {
            if (text.startsWith("555")) {
                throw new Start555Exception("ИСКЛЮЧЕНИЕ ");
            }
        } catch (Start555Exception ex) {
                    System.out.println(ex.getMessage() + DESCRIPTION);
        }
    }

    public static void seventhMethod(String text) throws End1a2bException {
        try{
        if (text.endsWith("1a2b")) {
            throw new End1a2bException("ИСКЛЮЧЕНИЕ ");
        }
        } catch (End1a2bException ex){
            System.out.println(ex.getMessage() + DESCRIPTION3);
        }
    }
}