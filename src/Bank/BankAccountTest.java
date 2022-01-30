package Bank;

import java.util.Scanner;

public class BankAccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("number of customers: ");
        int customerNum = scanner.nextInt();
//        String anything = scanner.next(); // user to skip the nextInt Line

        BankAccount[] accounts = new BankAccount[customerNum];

            for (int i = 0; i < customerNum; i++) {
                System.out.print("Customer-" + (i+1) + " Name: ");
//                String CustomerName = scanner.nextLine();
                accounts[i] = new BankAccount(scanner.next());
            }

        for (int i =0; i < accounts.length; i++){
            System.out.println(accounts[i]);
        }

        for (int i =0; i < accounts.length; i++){
            accounts[i].setBalance((long) (Math.random() * 10));
        }

        for (int i =0; i < accounts.length; i++){
            System.out.print(accounts[i].getOwner()+"'s ");accounts[i].getDeposts();
        }


        System.out.print("Number of Accounts: " + BankAccount.getDepostsTotal());


        scanner.close();

    }
}