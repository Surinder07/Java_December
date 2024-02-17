package feb17.bank;

public class Bank {

    double balance = 1000;

    double getBalance(){
        return balance;
    }

    double deposit(double depositAmount){
        balance = balance + depositAmount;
        return balance;
    }

    // 1000 - 100 = 900
    double withdraw(double withdrawAmount) {

        if (withdrawAmount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance = balance - withdrawAmount;
        return balance;
    }

}
