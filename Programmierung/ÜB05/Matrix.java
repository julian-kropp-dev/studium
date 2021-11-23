package ÜB05;

public class Matrix {
    public static void main(String[] args) {
        double[][] a = new double[][] { { 2, 1, 7 }, { 3, 0, 3 } };
        double[][] b = new double[][] { { 4, 2 }, { 7, 1 }, { 5, 2 } };

        if (!check(a, b)) {
            System.out.println("Die Matrizen sind nicht multiplizierbar!");
        } else {
            double[][] c = mult(a, b);
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    public static boolean check(double[][] a, double[][] b) {
        if (a[0].length == b.length) {
            return true;
        }
        return false;
    }

    public static double[][] mult(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c;
    }
}
