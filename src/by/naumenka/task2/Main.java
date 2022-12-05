package by.naumenka.task2;

//Дана произвольная строка.
//Вывести на консоль новую строку, в которой продублирована каждая буква из начальной строки.
//Например, "Hello" -> "HHeelllloo".

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите слово, где хотите продублировать буквы");
        Scanner str = new Scanner(System.in);
        String input = str.next();
        System.out.println(input.replaceAll(".", "$0$0"));
    }
}