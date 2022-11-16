package by.naumenka.task1;

public class Rectangle extends Figure {
    double a, b;

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void rashitArea() {
        area = a * b;
        System.out.println("S прямоугольника = " + area);
    }

    @Override
    public void rashitPerimeter() {
        perimeter = a + a + b + b;
        System.out.println("P прямоугольника = " + perimeter);
        System.out.println("");
    }
}