/**
 * Simple loyalty card account (base class)
 **/

public class ClubAccount {
    protected double balance;
    private int accNumber;

    public ClubAccount(int acc, double bal) {
        accNumber = acc;
        balance = bal;
    }

    public double getPointsBalance() {
        return balance;
    }

    public void addPoints(double deposit) {
        balance = balance + deposit;
    }

    public boolean redeemPoints(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return true;
        } else
            return false;
    }

    public int getAccNumber() {
        return accNumber;
    }
}