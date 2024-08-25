package ExceptionalHandling;

import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) throws InsufficientBalanceException {
        Bank obj = new Bank();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Deposit\n2.Withdraw\n3.CheckBalance");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter the Amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    obj.deposit(depositAmount);
                    System.out.println("Amount Deposited");
                    break;
                case 2:
                    System.out.println("Enter the Amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    obj.withdraw(withdrawAmount);
                    System.out.println("Amount Withdrawal is Successfull!");
                    break;
                case 3:
                    System.out.println("Account Balance is: "+ obj.checkBalance());
                    break;
            }
        }
    }
}

class Bank {
    Double accountBalance=0d;
    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if(amount>accountBalance) throw new InsufficientBalanceException("InsufficientBalanceException");
        else this.accountBalance -= amount;
    }

    public double checkBalance() {
        return accountBalance;
    }
}
class InsufficientBalanceException extends Exception{
    InsufficientBalanceException(String message){
        super(message);
    }
}
