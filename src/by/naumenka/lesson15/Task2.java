package by.naumenka.lesson15;

//    Создать коллекцию класса ArrayList со значениями имен всех студентов в группе
//    С помощью Stream'ов:
//- Вернуть количество людей с вашим именем (в независимости от верхнего/нижнего регистра букв)
//- Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
//- Отсортировать и вернуть первый элемент коллекции или Empty@, если коллекция пуста

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> students = Arrays.asList("Даша", "Вася", "Коля", "Леша", "Никита", "Никита", "Дима", "Паша", "Антон", "Женя", "Паша");
        System.out.println("Количество людей с именем Паша: " + students
                .stream()
                .filter(name -> name.equalsIgnoreCase("паша"))
                .count());

        System.out.println("Имена, начинающиеся на букву \"д\": " + students
                .stream()
                .filter(name -> name.toLowerCase().startsWith("д"))
                .collect(Collectors.toList()));

        List<String> sortedArray = students.stream()
                .sorted()
                .limit(1)
                .collect(Collectors.toList());

        if (sortedArray.isEmpty()) {
            System.out.println("Пустой");
        } else {
            System.out.println("Отсортировали и вернули первый элемент коллекции: " + sortedArray);
        }
    }
}