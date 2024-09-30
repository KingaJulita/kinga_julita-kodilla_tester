package wallet;

public class Wallet {
    private int balance = 0;

    public Wallet() {
    }

    public void deposit(int money) {
        this.balance += money;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        this.balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
