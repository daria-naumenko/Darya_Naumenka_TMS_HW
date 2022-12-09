package by.naumenka.lesson7.task1;

public class Circle extends Figure {
    double r, pi;

    Circle(double r, double pi) {
        this.r = r;
        this.pi = pi;
    }

    @Override
    public void rashitArea() {
        area = pi * (r * r);
        System.out.println("S круга = " + area);
    }

    @Override
    public void rashitPerimeter() {
        perimeter = 2 * pi * r;
        System.out.println("P круга = " + perimeter);
        System.out.println("");
    }
}