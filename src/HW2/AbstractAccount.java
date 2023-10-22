package HW2;

public class AbstractAccount implements Account {
    protected double balance;

    public AbstractAccount(double balance) {
        this.balance = balance;
    }
    @Override
    public double getAmount() {
        return balance;
    }
    @Override
    public void put(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Счет пополнен на " + amount + " у.е.");
        } else {
            throw new IllegalArgumentException("Некорректная сумма для пополнения");
        }
    }
    @Override
    public void take(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Со счета списано " + amount + " у.е.");
        } else {
            throw new IllegalArgumentException("Некорректная сумма для списания");
        }
    }
}

