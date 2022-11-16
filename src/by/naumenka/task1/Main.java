package by.naumenka.task1;

//Написать иерархию классов «Фигуры».
//Фигура -> Треугольник -> Прямоугольник -> Круг.
//Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра. Площадь треугольника по формуле Герона.
//Создать массив из 5 фигур.
//Вывести на экран сумму периметров и сумму площадей всех фигур в массиве.

public class Main {
    public static void main(String[] args) {

        double sumPerimeters = 0;
        double sumArea = 0;

        Figure[] figures = new Figure[5];
        figures[0] = new Circle(8, 3.14);
        figures[1] = new Rectangle(6, 5);
        figures[2] = new Rectangle(4, 3);
        figures[3] = new Triangle(2, 2, 2);
        figures[4] = new Triangle(3, 3, 3);

        for (Figure figure : figures) {

            figure.rashitArea();
            figure.rashitPerimeter();

            sumPerimeters += figure.perimeter;
            sumArea += figure.area;
        }
        System.out.println("Сумма всех периметров = " + sumPerimeters);
        System.out.println("Cумма всех площадей = " + sumArea);
    }
}