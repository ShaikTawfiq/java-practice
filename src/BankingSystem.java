import java.util.Scanner;
public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Account holder name : ");
        String name = sc.nextLine();
        System.out.println("enter account number: ");
        long accountNumber = sc.nextLong();
        System.out.println("enter your current balance: ");
        double balance = sc.nextDouble();
        System.out.println("enter amount to deposit");
        double depositAmount = sc.nextDouble();
        double newbalance = balance + depositAmount;
        System.out.println(" Account holder name : " + name);
        System.out.println("Account number : " + accountNumber);
        System.out.println("Current balance : " + balance);
        System.out.println("amount to deposit: " + depositAmount);
        sc.close();
    }
}