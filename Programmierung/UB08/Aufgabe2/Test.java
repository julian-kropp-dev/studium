package UB08.Aufgabe2;

public class Test {
    public static void main(String[] args) {

        // Test Accounts
        Account donald = new Account("Donald Duck", 0D);
        Account dagobert = new Account("Dagobert Duck", 100000D);

        // Auszahlen
        if (!donald.auszahlen(100D)) {
            System.out.println("Donald hat kein Geld");
        }
        donald.einzahlen(200D);
        if (!donald.auszahlen(100D)) {
            System.out.println("Geh arbeiten!");
        }
        System.out.println(donald.owner() + "s Kontostand: " + donald.balance() + " EUR");

        System.out.println();

        dagobert.owner("Dagobert");
        dagobert.einzahlen(1297000D);
        dagobert.auszahlen(420000D);
        dagobert.auszahlen(690000D);
        System.out.println(dagobert.owner() + "s Kontostand: " + dagobert.balance() + " EUR");
        System.out.println("Money Transfer");
        if (dagobert.transfer(500, donald)) {
            System.out.println("Erfolgreich");

        }
        System.out.println(dagobert.balance());
        System.out.println(donald.balance());
    }
}
