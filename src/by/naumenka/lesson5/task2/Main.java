package by.naumenka.lesson5.task2;

//Умножение двух матриц
//Создайте два массива целых чисел размером 3х3 (две матрицы). Напишите программу для умножения двух матриц.
//Первый массив: {{1,0,0,0},{0,1,0,0},{0,0,0,0}}
//Второй массив: {{1,2,3},{1,1,1},{0,0,0},{2,1,0}}
//Ожидаемый результат: 1 2 3 1 1 1 0 0 0

public class Main {
    public static void main(String[] args) {
        int[][] firstArray = {{1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 0, 0}};

        int[][] secondArray = {{1, 2, 3},
                {1, 1, 1},
                {0, 0, 0},
                {2, 1, 0}};

        int[][] finalArray = new int[3][3];

        for (int i = 0; i < firstArray.length; i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                for (int k = 0; k < secondArray.length; k++) {
                    finalArray[i][j] += firstArray[i][k] * secondArray[k][j];
                }
            }
        }
        for (int i = 0; i < finalArray.length; i++) {
            for (int j = 0; j < finalArray[0].length; j++) {
                System.out.print(" " + finalArray[i][j]);
            }
            System.out.println();
        }
    }
}