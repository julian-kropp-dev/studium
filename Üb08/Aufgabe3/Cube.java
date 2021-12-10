public class Cube {

    private double edgeLenght = 0D;

    public Cube(double cubeedgelenght) {
        edgeLenght = cubeedgelenght;
    }
    public double lenght() {
        return edgeLenght;
    }

    public double getSurfaceArea() {  
        double area;
        area = 6 * edgeLenght * edgeLenght;
        return area;
    }

    public double getVolume(){
        double volume;
        volume = edgeLenght * edgeLenght * edgeLenght;
        return volume;
    }

    public void change(double increment) {
        edgeLenght += increment;
    }

}