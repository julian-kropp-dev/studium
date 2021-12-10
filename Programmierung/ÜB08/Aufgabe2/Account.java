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

    // Transfer
    public boolean transfer(double amount, Account other) {
        if (balance - amount >= 0) {
            balance -= amount;
            other.einzahlen(amount);
            return true;
        }
        return false;
    }
}
