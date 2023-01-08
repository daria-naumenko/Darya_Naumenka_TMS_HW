package by.naumenka.lesson13;

//создать частотный словарь.
//сколько раз в введённой строке встречается каждая буква.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        System.out.println("Введите слово ");
        String string = scanner.nextLine();

        for (int i = 0; i < string.length(); i++) {
            if (map.isEmpty()) {
                map.put(string.charAt(i), 1);
            } else {
                if (!map.containsKey(string.charAt(i))) {
                    map.put(string.charAt(i), 1);
                } else {
                    map.put(string.charAt(i), map.get(string.charAt(i)) + 1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " →→→ " + entry.getValue());
        }
    }
}