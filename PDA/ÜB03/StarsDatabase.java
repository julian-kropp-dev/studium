import java.util.Scanner;

public class StarsDatabase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // setting up the database as arrays
        String[] names = new String[] { "Sirius", "Alpha Centauri", "Rigel", "Almaaz", "Luhman 16" };
        String[] ids = new String[] { "TYC 5949-2777-1", "TYC 9007-5849-1", "TYC 5331-1752-1", "TYC 2907-1275-1",
                "WISE J1049-5319A" };
        double[] distances = new double[] { 8.6D, 4.37D, 860D, 2000D, 6.589D };
        double[] apparentMagitude = new double[] { -1.46D, -0.27D, 0.13D, 2.92D, 14.94D };
        String[] types = new String[] { "Main sequence", "Main sequence", "Blue supergiant", "Yellow supergiant",
                "Brown dwarf" };

        boolean foundId = false;
        boolean foundDistance = false;

        // asking for the id
        System.out.println("Please enter the id you\'re looking for: ");
        String id = scan.nextLine();

        // loop through the length of the array
        for (int i = 0; i < ids.length; i++) {
            // check if the id is the one we're looking for
            if (ids[i].equals(id)) {
                // print out the name
                System.out.println("The name of this star is " + names[i] + ".");
                foundId = true;
                break;
            }
        }
        // check if any star with the id is found
        if (!foundId) {
            System.out.println("Star can\'t be found :(");
        }

        // search engine for stars with distance under 10 light years
        System.out.println("These stars have a distance under 10 light years:");
        for (int i = 0; i < ids.length; i++) {
            // print names of stars
            if (distances[i] < 10) {
                System.out.println(names[i]);
                foundDistance = true;
            }
        }
        // check if any star is found
        if (!foundDistance) {
            System.out.println("They\'re all too far away :(");
        }
    }
}
