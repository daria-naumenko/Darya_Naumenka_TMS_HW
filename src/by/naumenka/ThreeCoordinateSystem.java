package by.naumenka;

public class ThreeCoordinateSystem {
    private double x, y, z;
    public final String FIRSTINFO = "Вектор в трехмерной системе координат";

    public ThreeCoordinateSystem(double x, double y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void length() {
        System.out.println("Длина вектора: " + Math.sqrt(this.x * this.x + this.y * this.y + this.z + this.z));
    }

    public void scalar(double x1, double y1, double x0, double y0, double z1, double z0) {
        System.out.println("Скалярное произведение: " + x1 * x0 + y1 + y0 + z1 * z0);
    }

    public void sum(double x1, double y1, double x0, double y0, double z1, double z0) {
        System.out.println("Сумма векторов " + "(" + (x1 + x0) + ";" + (y1 + y0) + ";" + (z1 + z0) + ")");
    }

    public void raznost(double x1, double y1, double x0, double y0, double z1, double z0) {
        System.out.println("Разность векторов: " + "(" + (x1 - x0) + ";" + (y1 - y0) + ";" + (z1 - z0) + ")");
    }

    public static void createArray(int N) {
        int[] array = new int[N];
        for (int number : array) {
            int x = (int) (Math.random() * 15);
            int y = (int) (Math.random() * 15);
            int z = (int) (Math.random() * 15);
            System.out.println("(" + x + "; " + y + "; " + z + ")");
        }
    }

    @Override
    public String toString() {
        return "ThreeCoordinateSystem{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                ", INFO='" + FIRSTINFO + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThreeCoordinateSystem vector2 = (ThreeCoordinateSystem) o;
        return Double.compare(vector2.x, x) == 0 && Double.compare(vector2.y, y) == 0 && Double.compare(vector2.z, z) == 0;
    }
}