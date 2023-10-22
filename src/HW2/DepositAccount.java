package HW2;

import java.time.LocalDate;

public class DepositAccount extends AbstractAccount {
    private LocalDate lastWithdrawalDate;

    public DepositAccount(double balance) {
        super(balance);
        lastWithdrawalDate = LocalDate.now().minusMonths(1);
    }
    @Override
    public void take(double amount) {
        if (amount > 0 && amount <= getAmount()) {
            LocalDate currentDate = LocalDate.now();
            if (currentDate.isAfter(lastWithdrawalDate.plusMonths(1))) {
                super.take(amount);
                lastWithdrawalDate = currentDate;
                System.out.println("Со счета списано " + amount + " у.е.");
            } else {
                throw new IllegalArgumentException("Нельзя снять средства чаще, чем раз в месяц");
            }
        } else {
            throw new IllegalArgumentException("Некорректная сумма для списания");
        }
    }
}

