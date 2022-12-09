package by.naumenka.lesson4.task4_3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] firstArray = new int[5];
        int[] secondArray = new int[5];

        for (int i = 0; i < 5; i++) {
            firstArray[i] = (int) (Math.random() * 10);
            secondArray[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        double firstAverage = 0, secondAverage = 0;
        double sum1 = 0, sum2 = 0;
        for (int j = 0; j < 5; j++) {
            sum1 += firstArray[j];
            sum2 += secondArray[j];
            firstAverage = sum1 / firstArray.length;
            secondAverage = sum2 / secondArray.length;
        }
        System.out.println("Среднее арифметическое первого массива " + firstAverage);
        System.out.println("Среднее арифметическое второго массива " + secondAverage);

        if (firstAverage > secondAverage) {
            System.out.println("Среднее арифм-кое значение 1-го " + Arrays.toString(firstArray) + " больше " + Arrays.toString(secondArray));
        } else if (secondAverage > firstAverage) {
            System.out.println("Среднее арифм-кое значение 2-го " + Arrays.toString(secondArray) + " больше " + Arrays.toString(firstArray));
        } else if (secondAverage == firstAverage) {
            System.out.println("Среднее арифметическое значение " + Arrays.toString(secondArray) + " равно " + Arrays.toString(firstArray));
        }
    }
}