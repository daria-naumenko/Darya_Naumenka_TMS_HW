package by.naumenka.lesson7.task1;

public class Triangle extends Figure {
    double a, b, c, poluPerimeter;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void rashitArea() {
        poluPerimeter = (a + b + c) / 2;
        area = poluPerimeter * (poluPerimeter - a) * (poluPerimeter - b) * (poluPerimeter - c);
        System.out.println("S треугольника = " + area);
    }

    @Override
    public void rashitPerimeter() {
        perimeter = a + b + c;
        System.out.println("P треугольника = " + perimeter);
        System.out.println("");
    }
}