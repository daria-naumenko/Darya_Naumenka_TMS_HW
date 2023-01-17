package by.naumenka.lesson15;

//Создать коллекцию класса ArrayList наполнить ее элементами
//        рандомными элементами типа Integer.
//        С помощью Stream'ов:
//        - Удалить дубликаты
//        - Вывести все четные элементы в диапазоне от 7 до 17
//        (включительно)
//        - Каждый элемент умножить на 2
//        - Отсортировать и вывести на экран первых 4 элемента
//        - Вывести количество элементов в стриме
//        - Вывести среднее арифметическое всех чисел в стриме

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println("Коллекция ArrayList с рандомными элементами типа Integer: \n " + list);

        System.out.print("Четные элементы в диапазоне [7,17] умноженные на 2: ");
        list.stream()
                .distinct()
                .filter(number -> number >= 7 && number <= 17 && (number % 2 == 0))
                .map(number -> number * 2)
                .sorted()
                .limit(4)
                .forEach(number -> System.out.print(number + " "));

        long amount = list.stream().count();
        System.out.println("\nКоличество элементов: " + amount);

        double sum = list.stream().reduce(Integer::sum).get();
        System.out.println("Среднее арифметическое: " + sum / amount);
    }
}