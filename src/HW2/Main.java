package HW2;

public class Main {
    public static void main(String[] args) {
        Account account = new AbstractAccount(100);
        account.put(50);
        account.take(20);
        System.out.println("Текущий баланс: " + account.getAmount());

        Account creditAccount = new CreditAccount(100);
        creditAccount.take(30);
        System.out.println("Текущий баланс: " + creditAccount.getAmount());

        Account depositAccount = new DepositAccount(100);
        depositAccount.take(20);
        depositAccount.take(30);
        System.out.println("Текущий баланс: " + depositAccount.getAmount());

        Account fixedAmountAccount = new FixedAmountAccount(500);
        fixedAmountAccount.put(100);
        fixedAmountAccount.take(50);
        System.out.println("Текущий баланс: " + fixedAmountAccount.getAmount());
    }
}

