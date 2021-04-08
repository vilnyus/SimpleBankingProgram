package com.company;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        String accountName;
        double startBalance;

        System.out.print("%24s\n" + "Banking app v1.0");
        System.out.print("\n=====================================");
        System.out.print("\nPlease enter your details below.");
        System.out.print("\nAccount Name: ");
        accountName = scanner.nextLine();
        System.out.print("\nStarting Balance: ");
        startBalance = scanner.nextDouble();

        Account myAccount = new Account(accountName, startBalance);

        while(!quit)
        {
            printMainMenu();
            choice = scanner.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Account name: " + myAccount.getAccountName() + "\nBalance is $" + myAccount.getAccountBalance());
                    break;
                case 2:
                    System.out.print("Input transfer amount: $");
                    myAccount.transferFounds(scanner.nextDouble());
                    break;
                case 3:
                    System.out.print("Input deposit amount: $");
                    myAccount.depositFounds(scanner.nextDouble());
                case 4:
                    quit = true;
                    break;
            }
        }
        scanner.close();
    }

    public static void printMainMenu()
    {
        System.out.print("******************\n" +
                "1 - To check balance\n" +
                "2 - To transfer amount\n" +
                "3 - To withdraw amount\n" +
                "4 - To quit\n" +
                "******************\n");
    }

}
