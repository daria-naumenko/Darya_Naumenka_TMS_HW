package by.naumenka.lesson12;

public class Document {
    public static void startDocument(String str) {
        if (str.startsWith("docnum") || str.startsWith("contract")) {
            System.out.println("начинается с 'docnum/contract'");
        } else {
            System.out.println("НЕ начинается с 'docnum/contract'");
        }
    }

    public static void lengthDocument(String str) {
        if (str.length() != 15) {
            System.out.println("НЕ содержит 15 символов");
            ;
        } else {
            System.out.println("содержит 15 символов");
        }
    }

    public static void checkAnotherSymbol(String str) {
        char[] array = str.toCharArray();
        int notNumOrLetter = 0;

        for (int count : array) {
            if (!Character.isLetterOrDigit(count)) {
                notNumOrLetter++;
            }
        }

        if (notNumOrLetter == 0) {
            System.out.println("НЕ содержит служебных символов");
        } else {
            System.out.println("содержит служебные символы");
        }
    }
}