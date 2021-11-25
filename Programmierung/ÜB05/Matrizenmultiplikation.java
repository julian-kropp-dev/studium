public class Matrizenmultiplikation {
    public static void main(String[] args) {
        double[][] mata = new double[][] { { 2, 1, 7 }, { 3, 0, 3 } };
        double[][] matb = new double[][] { { 4, 2 }, { 7, 1 }, { 5, 2 } };
    //    double[][] mata = new double[][] {{5, 8 , 6}, {4,6,5}, {5,4,8}, {5,4,8}};
    //    double[][] matb = new double[][] {{4,7,9,2},{5,8,6,8},{6,4,6,5}};

        //int matacol = mata[0].length;
        int matarow = mata.length;
        int matbcol = matb[0].length;
        //int matbrow = matb.length;
        // System.out.println("Mat A hat "+matacol+" Spalten und "+matarow+" Zeilen");
        // System.out.println("Mat B hat "+matbcol+" Spalten und "+matbrow+" Zeilen");

        if (!test(mata, matb)) {    // Teste ob Multipliaktion eraluabt ist
            System.out.println("MatError Spaltenzahl von Mat A ist nicht gleich Zeilenzahl von Mat B!");    
        }
        else {
            double[][] result = new double[matarow][matbcol];     // Erebniss Matrix C mit den Zeilen von A und den Spalten von B 
            for (int i = 0; i < matarow; i++) {
                for (int j = 0; j < matbcol; j++) {          // Zeile i von Mat A x Spalte j von Mat B
                    result[i][j] = rowxcolum(i, j, mata, matb);
                    System.out.print(result[i][j]);
                    System.out.print("  ");
                }
                System.out.println("");
            }
        }
    }

    // Valide wenn Spalten von Mat A = Zeilen von Mat B
    public static boolean test(double[][] mata, double[][] matb) {
        if (mata[0].length == matb.length) {
            return true;
        }
        return false;
    }
    
    // Geg: Zeile Mat A (z)
    //      Spalte Mat B (s)
    // Errechnet das Ergebnis für Cz, indem die Produkte der entsprechenden Einträge der geg. Zeile von Mat A und der geg. Spalte von Mat B aufsummiert werden
    public static int rowxcolum(int rownummata, int colnummatb, double[][] mata, double[][] matb) { 
        int val = 0;
        for (int j = 0; j < matb.length; j++) {
                val = val + (int) (mata[rownummata][j] * matb[j][colnummatb]);   
            } 
        return val;
    }      
}