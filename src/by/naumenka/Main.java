package by.naumenka;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            Scanner in = new Scanner(System.in);

            System.out.println("Введите число");
            int number = in.nextInt();
            System.out.println("Вы ввели число " + number);
            if (number > 0 && number < 15) {
                System.out.println("Группа 1");
                for (int i = 0; i < 1; i++) {
                    System.out.println("Не ешьте на ночь сырых помидоров! - Остап Бендер");
                }
                System.out.println("Хотите продолжить? Нажмите Enter, иначе введите 'выход' ");
            } else if (number < 30 && number >= 15) {
                System.out.println("Группа 2");
                for (int i = 0; i < 2; i++) {
                    System.out.println("Не ешьте на ночь сырых помидоров! - Остап Бендер");
                }
                System.out.println("Хотите продолжить? Нажмите Enter, иначе введите 'выход' ");
            } else if (number >= 30) {
                System.out.println("Группа 3");
                for (int i = 0; i < 3; i++) {
                    System.out.println("Не ешьте на ночь сырых помидоров! - Остап Бендер");
                }
                System.out.println("Хотите продолжить? Нажмите Enter, иначе введите 'выход' ");
            } else {
                System.out.println("Не в диапазоне, проверь введенное число");
                System.out.println("Хотите проверить? Нажмите Enter, иначе введите 'выход' ");
            }

            input = reader.readLine();
            if (exit.equals("exit")) break;
        }
    }
}
