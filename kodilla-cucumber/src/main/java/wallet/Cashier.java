package wallet;

public class Cashier {
    private final CashSlot cashSlot;

    public Cashier(CashSlot cashSlot) {
        this.cashSlot = cashSlot;
    }

    public void withdraw(Wallet wallet, int amount) {
        try {
            wallet.withdraw(amount);
            cashSlot.dispense(amount);
        } catch (IllegalArgumentException e) {
            cashSlot.dispense(0);
            throw e;
        }
    }
}
