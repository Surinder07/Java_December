package feb17.bank;

import feb17.protect.parent.Parent;

public class BankMain {

    public static void main(String[] args) {
        Bank bank = new Bank();

        System.out.println("Current balance in the account : "+bank.getBalance());

        double balance = bank.deposit(500);
        System.out.println("Balance after 500 deposit "+ balance);


           double balanceAfterWithdraw = bank.withdraw(2400);

        System.out.println("Balance after 400 withdraw " + balanceAfterWithdraw);
    }
}
