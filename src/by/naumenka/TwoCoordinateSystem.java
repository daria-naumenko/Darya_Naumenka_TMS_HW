package by.naumenka;

public class TwoCoordinateSystem {
    private double x, y;

    public TwoCoordinateSystem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y);
    }
}