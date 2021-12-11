package UB08.Aufgabe3;

public class Sphere {

    private double radius = 0D;

    public Sphere(double sphereradius) {
        radius = sphereradius;
    }

    public double radius() {
        return radius;
    }

    public double getSurfaceArea() {
        double area;
        area = 4D * Math.pow(radius, 2D) * Math.PI;
        return area;
    }

    public double getVolume() {
        double volume;
        volume = (4D / 3D) * Math.PI * Math.pow(radius, 3D);
        return volume;
    }

    public void change(double increment) {
        radius += increment;
    }

}
