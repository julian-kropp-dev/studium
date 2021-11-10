import java.util.Scanner;

public class Ratespiel {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //generate random number
        int randomNumber = (int) (Math.random() * 101.0);
        int trys = 0;
        boolean win = false;

        System.out.println("Ich denk mir eine Zahl zwischen 0 und 100...");
        //loop until user gets the number
        while(!win) {
            //get the user Input
            System.out.println("Rate meine Zahl: ");
            int userInput = scan.nextInt();
            //user gets the number and wins
            if(userInput == randomNumber) {
                win = true;
                System.out.println("Korrekt. Das war meine Zahl: " + randomNumber);
                System.out.println("Du hast: " + trys + " Versuche gebraucht.");
            }
            //number bigger
            if(userInput < randomNumber) {
                System.out.println("Nein. Meine Zahl ist größer.");
            }
            //number smaller
            if(userInput > randomNumber) {
                System.out.println("Nein. Meine Zahl ist kleiner.");
            }
            //count the trys needed
            trys++;
        }


    }
}
