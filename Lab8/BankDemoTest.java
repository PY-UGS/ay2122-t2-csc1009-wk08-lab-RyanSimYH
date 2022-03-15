package Lab8;

import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) throws InsufficientFundsException {
        Scanner in = new Scanner(System.in);
        CheckingAccount checkingAccount = new CheckingAccount(10000, 123456);
        while (true) {

            System.out.println("Choose 1 for Withdrawal");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 to Exit");
            System.out.print("Choose the operation you want to perform:");

            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    try {
                        System.out.print("Enter amount to be withdrawn: ");
                        double withdrawAmount = in.nextDouble();
                        checkingAccount.withdraw(withdrawAmount);
                        System.out.println("The balance after withdrawal is: $" + checkingAccount.getBalance());
                        System.out.println("Please collect your card and cash.");
                        break;
                    } catch (InsufficientFundsException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                case 2:
                    System.out.print("Enter amount to be deposited: ");
                    double depositAmount = in.nextDouble();
                    checkingAccount.deposit(depositAmount);
                    System.out.println("Amount deposited: " + depositAmount);
                    System.out.println("The balance after the deposit is: $" + checkingAccount.getBalance());
                    break;
                case 3:
                    System.out.println("Please collect your card. Have a nice day!");
                    System.exit(0);

            }

        }
    }
}
