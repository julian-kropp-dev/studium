import java.util.Scanner;
public class Volume {
    public static void main(String[] args) {

        // Körper initialisieren 
        Cube cube = new Cube(inputcubelenght());
        Sphere sphere = new Sphere(inputsphereradius());
        
        
        // Volumen und Differnzvolumen ausgeben
        System.out.println("Das Volumen des Würfel beträgt: "+cube.getVolume());
        System.out.println("Das Volumen der Kugel beträgt: "+sphere.getVolume());
        System.out.println("Die Differnz der Volumia beträgt: "+Math.abs(cube.getVolume()-sphere.getVolume()));
        System.out.println("Gebe nun einen Inkrement Wert ein, um die Volumia anzugleichen");
        
        // Inkrement Wert erfragen
        double increment = inputincrement();
        int step = 0;
        
        // Volumen angleichen
        if (sphere.getVolume()>cube.getVolume()) {
            while (sphere.getVolume() > cube.getVolume()) {
                cube.change(increment);
                sphere.change(-1*increment);
                step++;
            }
            System.out.println("In "+step+" Schritten:");
            System.out.println("Das Volumen des Würfel beträgt: "+cube.getVolume());
            System.out.println("Das Volumen der Kugel beträgt: "+sphere.getVolume());
            System.out.println("Die Oberfläche des Würfel beträgt: "+cube.getSurfaceArea());
            System.out.println("Die Oberflächeder Kugel beträgt: "+sphere.getSurfaceArea());     
        } else {
            while (sphere.getVolume() < cube.getVolume()) {
                cube.change(-1*increment);
                sphere.change(increment);
                step++;
            }
            System.out.println("In "+step+" Schritten:");
            System.out.println("Das Volumen des Würfel beträgt: "+cube.getVolume());
            System.out.println("Das Volumen der Kugel beträgt: "+sphere.getVolume());
            System.out.println("Die Oberfläche des Würfel beträgt: "+cube.getSurfaceArea());
            System.out.println("Die Oberflächeder Kugel beträgt: "+sphere.getSurfaceArea()); 
        }
        
    }

    // User Input Checker 
    public static double inputcubelenght() {
        Scanner sca = new Scanner(System.in);
        double edgelenght;
        do {
        System.out.println("Gebe die Kantenlänge eines Würfels ein:");
        while (!sca.hasNextDouble()) {
            System.out.println("Das ist keine Nummer!\nDu kannst eine postive nicht-ganze Zahl eingeben (z.B.: 10,5)\nGebe die Kantenlänge eines Würfels ein:");
            sca.next();
            }
            edgelenght = sca.nextDouble();
        } while (edgelenght <= 0);
        return edgelenght;      
    }

    public static double inputsphereradius() {
        Scanner scr = new Scanner(System.in);
        double  radius;
        do {
        System.out.println("Gebe den Radius einer Kugel ein:");
        while (!scr.hasNextDouble()) {
            System.out.println("That's not a number!\nDu kannst eine postive nicht-ganze Zahl eingeben (z.B.: 10,5)\nGebe den Radius einer Kugel ein:");
            scr.next();
            }
        radius = scr.nextDouble();
        } while (radius <= 0);
        return radius;        
    }

    public static double inputincrement() {
        Scanner sci = new Scanner(System.in);
        double increment;
        do {
        System.out.println("Gebe einen Inkrement Wert ein:");
        while (!sci.hasNextDouble()) {
            System.out.println("Das ist keine Nummer!\nDu kannst eine postive nicht-ganze Zahl eingeben (z.B.: 10,5)\nGebe einen Inkrement Wert ein:");
            sci.next();
            }
            increment = sci.nextDouble();
        } while (increment <= 0);
        return increment;        
    }
   
}