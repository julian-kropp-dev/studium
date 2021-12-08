package ÜB07.Aufgabe4;

public class Test {
    public static void main(String[] args) {
        Account donald = new Account("Donald Duck");
        if (!donald.auszahlen(100D)) {
            System.out.println("Geh arbeiten!");
        }
        donald.einzahlen(1800D);
        if (!donald.auszahlen(1613D)) {
            System.out.println("Geh arbeiten!");
        }
        System.out.println(donald.owner() + "s Kontostand: " + donald.balance() + " EUR");

        System.out.println();

        Account dagobert = new Account("Dagobart Duck");
        dagobert.owner("Dagobert");
        dagobert.einzahlen(1297000D);
        dagobert.auszahlen(420000D);
        dagobert.auszahlen(690000D);
        System.out.println(dagobert.owner() + "s Kontostand: " + dagobert.balance() + " EUR");
    }
}
