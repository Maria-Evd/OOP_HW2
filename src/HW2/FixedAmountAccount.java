package HW2;

public class FixedAmountAccount extends AbstractAccount {
    public FixedAmountAccount(double balance) {
        super(balance);
    }
    @Override
    public void put(double amount) {
        throw new IllegalArgumentException("Операция невозможна для данного типа счета");
    }

    @Override
    public void take(double amount) {
        throw new IllegalArgumentException("Операция невозможна для данного типа счета");
    }
}

