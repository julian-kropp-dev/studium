package ÜB08.Augabe1;

public class Star {
    private String name;
    private String id;
    private String type;
    private double distance;
    private double apparentMagnitude;

    public Star() {
    }

    public Star(String _name, String _id) {
        name = _name;
        id = _id;
    }

    public String name() {
        return name;
    }

    public void name(String value) {
        name = value;
    }

    public String id() {
        return id;
    }

    public void id(String value) {
        id = value;
    }

    public String type() {
        return type;
    }

    public void type(String value) {
        type = value;
    }

    public double distance() {
        return distance;
    }

    public void distance(double value) {
        distance = value;
    }

    public double apperentMagnitude() {
        return apparentMagnitude;
    }

    public void apperentMagnitude(double value) {
        apparentMagnitude = value;
    }

    @Override
    public String toString() {
        return name;
    }
}