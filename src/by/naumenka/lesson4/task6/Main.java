package by.naumenka.lesson4.task6;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] array = {"Darya", "Dan", "Egor", "Alesya"};
        System.out.println("Неотсортированный массив: " + Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }
}