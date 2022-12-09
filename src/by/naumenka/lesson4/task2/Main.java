package by.naumenka.lesson4.task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите длину массива ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Ваш массив " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Отсортировали массив: " + Arrays.toString(array));
        System.out.println("min = " + array[0]);
        System.out.println("max = " + array[size - 1]);

        double sum = 0;
        for (int var : array) {
            sum += var;
        }
        double average = sum / size;
        System.out.printf("Среднее значение чисел в массиве = %.2f", average);
    }
}