package UB08.Aufgabe2;

public class Account {

    private String owner = ""; // OWNER Value
    private double balance = 0D; // BALANCE Value

    public Account(String name, double _balance) { // Constructor
        owner = name;
        balance = _balance;
    }

    public String owner() {
        return owner;
    }

    public void owner(String value) {
        owner = value;
    }

    public double balance() {
        return balance;
    }

    //// Im Beispiel ohne sinnvolle Verwendung
    // public void balance(double value) {
    // balance = value;
    // }

    // EINZAHLEN
    public boolean einzahlen(double value) {
        if (value > 0) {
            balance += value;
            return true;
        }
        return false;
    }

    // AUSZAHLEN
    public boolean auszahlen(double value) {
        if (value > 0) {
            if (balance >= value) {
                balance -= value;
                return true;
            }
        }
        return false;
    }

    // Transfer
    public boolean transfer(double amount, Account other) {
        if (amount > 0) {
            if (other != this) {
                if (auszahlen(amount)) {
                    other.einzahlen(amount);
                    return true;
                }
            }
        }
        return false;
    }
}
