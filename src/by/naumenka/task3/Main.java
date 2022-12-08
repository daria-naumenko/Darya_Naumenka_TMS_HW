package by.naumenka.task3;

//3. Дана строка произвольной длины с произвольными словами.
// Найти самое короткое слово в строке и вывести его на экран.
// Найти самое длинное слово в строке и вывести его на экран.
// Если таких слов несколько, то вывести последнее из них.

public class Main {
    public static void main(String[] args) {
        String text = "Сегодня хорошая погода";
        System.out.println(text);
        String[] words = text.split(" ");

        shortWordMethod(words);
        longWordMethod(words);
    }

    public static void shortWordMethod(String[] words) {
        String shortWord = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= shortWord.length()) {
                shortWord = words[i];

            }
        }
        System.out.println("'" + shortWord + "'" + " - самое короткое слово");
    }

    public static void longWordMethod(String[] words) {
        String longWord = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= longWord.length()) {
                longWord = words[i];

            }
        }
        System.out.println("'" + longWord + "'" + " - самое длинное слово");
    }
}