package ÜB07.Aufgabe4;

public class Account {

    // OWNER
    private String owner = "";

    public Account(String value) {
        owner = value;
    }

    public String owner() {
        return owner;
    }

    public void owner(String value) {
        owner = value;
    }

    // BALANCE
    private double balance = 0D;

    public double balance() {
        return balance;
    }

    //// Im Beispiel ohne sinnvolle Verwendung
    // public void balance(double value) {
    // balance = value;
    // }

    // EINZAHLEN
    public void einzahlen(double value) {
        balance += value;
    }

    // AUSZAHLEN
    public boolean auszahlen(double value) {
        if (balance - value >= 0) {
            balance -= value;
            return true;
        }
        return false;
    }
}
