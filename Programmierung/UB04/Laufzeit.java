package UB04;

public class Laufzeit {
    public static void main(String[] args) {
        int prod = 0;
        int n = 7;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= Math.pow(2, i); j++) {
                prod++;
            }
        }
        System.out.println("für n=" + n + ": " + prod);
    }
}
