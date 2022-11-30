package by.naumenka;

public class ThreeCoordinateSystem {
    private double x,y,z;

    public ThreeCoordinateSystem(double x, double y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double length() {
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z + this.z);
    }
}
