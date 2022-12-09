package by.naumenka.lesson5.task6;

//Создайте двумерный массив целых чисел. Отсортируйте элементы в строках двумерного массива по возрастанию.

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] array = {{3, 1, 6}, {6, 9, 2}, {0, 4, 5}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
            }
        }System.out.println("Неотсортированный массив:\n"+ Arrays.deepToString(array));
        for (int i = 0; i < array.length; i++){
            Arrays.sort(array[i]);
        }System.out.println("Отсортированный массив:\n"+Arrays.deepToString(array));
    }
}

