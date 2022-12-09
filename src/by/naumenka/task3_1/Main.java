package by.naumenka.task3_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        int number = in.nextInt();
        int numberOfCitations = 0;

        if (number > 0 && number < 15) {
            System.out.println("Группа 1");
            numberOfCitations = 1;
        } else if (number < 30 && number >= 15) {
            System.out.println("Группа 2");
            numberOfCitations = 2;
        } else if (number >= 30) {
            System.out.println("Группа 3");
            numberOfCitations = 3;
        } else {
            System.out.println("Не в диапазоне, проверь введенное число");
        }
        for (int i = 0; i < numberOfCitations; i++) {
            System.out.println("Не ешьте на ночь сырых помидоров! - Остап Бендер");
        }
    }
}

