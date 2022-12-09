package by.naumenka.lesson9;

// 1. Создайте класс, который описывает вектор в двумерной системе координат.
//Создайте класс, который описывает вектор в трехмерной системе координат.
//У каждого класса должны быть:
//- конструктор с параметрами в виде списка координат (например, x, y, z);
//- метод, вычисляющий длину вектора. Корень можно посчитать с помощью Math.sqrt();
//- метод, вычисляющий скалярное произведение;
//- метод сложения векторов;
//- метод разности векторов;
//- статический метод, который принимает целое число N, и
//возвращает массив случайных векторов размером N.
//Предусмотреть метод сравнение векторов.
//Предусмотреть метод для вывода информации о векторе.
//Каждый из классов должен иметь константу, содержащею описание вектора.
//Например, "Это вектор для двумерной системы координат".
//Эта константа так же должна выводиться в методе для вывода информации о векторе.

public class Main {
    public static void main(String[] args) {
        TwoCoordinateSystem vector = new TwoCoordinateSystem(3, 2);
        vector.scalar(3, 2, 1, 1);
        vector.raznost(1, 5, 6, 3);
        vector.sum(2, 2, 1, 5);
        System.out.println("Массив случайных векторов: ");
        TwoCoordinateSystem.createArray(3);
        vector.length();
        System.out.println(vector.toString() + "\n");

        ThreeCoordinateSystem vector2 = new ThreeCoordinateSystem(3, 1, 6);
        vector2.scalar(3, 2, 0, 0, 1, 4);
        vector2.raznost(3, 4, 1, 8, 4, 5);
        vector2.sum(3, 4, 1, 1, 1, 0);
        System.out.println("Массив случайных векторов: ");
        ThreeCoordinateSystem.createArray(2);
        vector2.length();
        System.out.println(vector2.toString());

        if (vector.equals(vector2)) {
            System.out.println("\n" + "ВЕКТОРА РАНВЫ");
        } else {
            System.out.println("\n" + "ВЕКТОРА НЕ РАВНЫ");
        }
    }
}