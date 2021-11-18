package ÜB02;

public class Wertekombination {
    public static void main(String[] args) {
        int i = 10;
        long l = 900000L;
        float f = 30.2F;
        double d = 25.5D;
        char c = 'a';

        // sum of all variables as double
        double sumDouble = i + l + f + d + c;
        // sum of all variables as int
        int sumInt = i + (int) l + (int) f + (int) d + c;

        // output to check if everything is fine
        System.out.println("sumDouble: " + sumDouble);
        System.out.println("sumInt: " + sumInt);
    }
}
