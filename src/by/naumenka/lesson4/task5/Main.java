package by.naumenka.lesson4.task5;

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
        for (int i = 0; i < array.length; i++) {
            if(i%2 == 1){
                array[i] = 0;
            }
        }
        System.out.println("Массив без нечетных индексов " + Arrays.toString(array));
    }
}