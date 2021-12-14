package ÜB05;

import java.util.Arrays;

public class Methoden {
    public static void main(String[] args) {

        // Min
        int[] arrInt = new int[] { 4, 6, 92, 4, 1, 2 };
        System.out.println(min(arrInt));
        System.out.println();

        // Product
        double[] arrDouble = new double[] { 4, 6, 92, 4, 1, 2 };
        System.out.println(product(arrDouble));
        System.out.println();

        // LatinLetter
        System.out.println(isLatinLetter('.'));
        System.out.println();

        // IdentityMatrix
        int[][] matrix = createIdentityMatrix(4);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Min: sort array and return first (minimum) value
    public static int min(int[] values) {
        Arrays.sort(values);
        return values[0];
    }

    // Product: loop through array, multiply all values and return double result
    public static double product(double[] values) {
        double result = 1;
        for (int i = 0; i < values.length; i++) {
            result *= values[i];
        }
        return result;
    }

    // LatinLetter: check if the unicode of char is a latin letter and return
    // boolean
    public static boolean isLatinLetter(char letter) {
        if ((64 < letter && letter < 91) || (96 < letter && letter < 123)) {
            return true;
        }
        return false;
    }

    // IdentityMatrix: create a quadratic matrix of specified size and fill with
    // zeros, then loop through and change [i][i] to 1 and return the IdentityMatrix
    public static int[][] createIdentityMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            Arrays.fill(matrix[i], 0);
            matrix[i][i] = 1;
        }
        return matrix;
    }
}
