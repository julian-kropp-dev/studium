package UB05;

public class Matrix {
    public static void main(String[] args) {

        // Eingabe der Matrizen
        double[][] a = new double[][] { { 5, 8, 6 }, { 4, 6, 5 }, { 5, 4, 8 }, { 5, 4, 8 } };
        double[][] b = new double[][] { { 4, 7, 9, 2 }, { 5, 8, 6, 8 }, { 6, 4, 6, 5 } };

        // Überprüfe auf Multiplizierbarkeit
        if (!check(a, b)) {
            System.out.println("Die Matrizen sind nicht multiplizierbar!");
        } else {

            // Erstellen des Ergebnisses
            double[][] c = mult(a, b);

            // Ausgabe des Ergebnisses
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[i].length; j++) {
                    System.out.print(c[i][j] + " ");
                }
                System.out.println();
            }
        }
    }

    // Überprüfe auf Multiplizierbarkeit
    public static boolean check(double[][] a, double[][] b) {
        if (a[0].length == b.length) {
            return true;
        }
        return false;
    }

    // Multiplizeiren der Matrizen
    public static double[][] mult(double[][] a, double[][] b) {
        double[][] c = new double[a.length][b[0].length]; // Länge des Ergebnis-Arrays
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) { // Summenformel
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return c; // Ergebnis zurückgeben
    }
}
