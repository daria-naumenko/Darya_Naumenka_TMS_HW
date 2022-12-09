package by.naumenka.lesson5.task4;

//4. Создайте двумерный массив целых чисел. Выведите на консоль сумму всех элементов массива.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int sum = 0;
        int[][] array = new int[n][m];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10);
                sum += array[i][j];
            }
        }
        System.out.println("Массив: " + Arrays.deepToString(array));
        System.out.println("Сумма всех элементов равна " + sum);
    }
}