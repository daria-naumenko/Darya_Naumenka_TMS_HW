package by.naumenka.lesson9;

public class TwoCoordinateSystem {
    private double x, y;
    public static final String SECONDINFO = "Вектор в двухмерной системе координат";

    public TwoCoordinateSystem(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void length() {
        System.out.println("Длина вектора: " + Math.sqrt(this.x * this.x + this.y * this.y));
    }

    public void scalar(double x1, double y1, double x0, double y0) {
        System.out.println("Cкалярное произведение векторов " + x1 * x0 + y1 * y0);
    }

    public void sum(double x1, double y1, double x0, double y0) {
        System.out.println("Сумма векторов " + "(" + (x1 + x0) + "; " + (y1 + y0) + ")");
    }

    public void raznost(double x1, double y1, double x0, double y0) {
        System.out.println("Разность векторов " + "(" + (x1 - x0) + "; " + (y1 - y0) + ")");
    }

    public static void createArray(int N) {
        int[] array = new int[N];
        for (int number : array) {
            int x = (int) (Math.random() * 15);
            int y = (int) (Math.random() * 15);
            System.out.println("(" + x + "; " + y + ")");
        }
    }

    @Override
    public String toString() {
        return "TwoCoordinateSystem{" +
                "x=" + x +
                ", y=" + y +
                ", INFO='" + SECONDINFO + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TwoCoordinateSystem vector = (TwoCoordinateSystem) o;
        return Double.compare(vector.x, x) == 0 && Double.compare(vector.y, y) == 0;
    }
}