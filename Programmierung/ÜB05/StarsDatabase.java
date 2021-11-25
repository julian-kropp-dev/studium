

import java.util.ArrayList;
import java.util.Scanner;

public class StarsDatabase {

    // setting up the database as arrays
    public static String[] names = new String[] { "Sirius", "Alpha Centauri", "Rigel", "Almaaz", "Luhman 16" };
    public static String[] ids = new String[] { "TYC 5949-2777-1", "TYC 9007-5849-1", "TYC 5331-1752-1",
            "TYC 2907-1275-1", "WISE J1049-5319A" };
    public static double[] distances = new double[] { 8.6D, 4.37D, 860D, 2000D, 6.589D };
    // public static double[] apparentMagitude = new double[] { -1.46D, -0.27D,
    // 0.13D, 2.92D, 14.94D };
    public static String[] types = new String[] { "Main sequence", "Main sequence", "Blue supergiant",
            "Yellow supergiant", "Brown dwarf" };

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // DBSize
        System.out.println(dbSize());
        System.out.println();

        // IndexOfId
        System.out.println("Please enter the id you\'re looking for: ");
        String id = scan.nextLine();
        int result1 = indexOfId(id);
        if (result1 < 0) {
            System.out.println("No star found...");
        } else {
            System.out.println("Index: " + result1);
        }
        System.out.println();
        scan.close();

        // NameType
        System.out.println(nameType(3));
        System.out.println();

        // Lichtjahre
        ArrayList<Integer> result2 = lichtjahre(1000D);
        System.out.print(result2);
        System.out.println();

    }

    public static int dbSize() {
        return ids.length;
    }

    public static int indexOfId(String id) {
        for (int i = 0; i < ids.length; i++) {
            if (ids[i].equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public static String nameType(int index) {
        return names[index] + " (" + types[index] + ")";
    }

    public static ArrayList<Integer> lichtjahre(double distance) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] < distance) {
                result.add(i);
            }
        }
        return result;
    }

    public static void newType(String id) {
        for (int i = 0; i < ids.length; i++) {
            if (id.equals(ids[i])) {
                types[i] = "Moon";
                break;
            }
        }
    }
}
