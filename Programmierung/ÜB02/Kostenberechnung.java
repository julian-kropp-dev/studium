import java.text.DecimalFormat;
import java.util.Scanner;

public class Kostenberechnung {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //asking user for input
        System.out.println("Anzahl Downloads (>=0): ");
        int downloads = scan.nextInt();

        int free = 5;
        int twenty = 30;
        float price = 0.0F;
        //using decimal format for a fancy looking price
        DecimalFormat df = new DecimalFormat("###.##");

        //if downloads are less than 5, its free.
        if(downloads > 5) {
            //for all downloads exept the free ones
            for (int i = 0; i < downloads-5; i++) {
                //check if there are any twenty cent downloads left
                if(twenty > 0) {
                    //reduce the twenty cent downloads left and add 0.2 Euro to the price
                    twenty--;
                    price += 0.2D;
                } else {
                    //add 0.15 Euro to the price cause no twenty cent downloads left
                    price += 0.15D;
                }
            }
            System.out.println("Kosten = " + df.format(price) + " Euro");
        } else {
            System.out.println("Die Songs gehen aufs Haus :)");
        }

        scan.close();
    }
}
