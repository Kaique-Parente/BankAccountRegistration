package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner e = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = e.nextInt();
        e.nextLine();

        System.out.print("Enter account holder: ");
        String accountHolder = e.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char response = e.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = e.nextDouble();
            account = new Account(accountNumber, accountHolder, initialDeposit);
        } else {
            account = new Account(accountNumber, accountHolder);
        }

        System.out.println("");
        System.out.println("Account data:\n" + account);

        System.out.println("");
        System.out.print("Enter a deposit value: ");
        double depositValue = e.nextDouble();
        account.deposit(depositValue);

        System.out.println("Updated account data:\n" + account);

        System.out.println("");
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = e.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("Updated account data:\n" + account);
    }
}
