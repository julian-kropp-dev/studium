package ÜB08.Aufgabe3;

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
        area = 4 * radius * radius * Math.PI;
        return area;
    }

    public double getVolume() {
        double volume;
        volume = 1.333333 * Math.PI * radius * radius * radius;
        return volume;
    }

    public void change(double increment) {
        radius += increment;
    }

}
