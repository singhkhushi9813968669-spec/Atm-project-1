import java.util.*;

class Atm {
    float balance;
    int pin = 2026;

    public void checkPin() {
        System.out.print("Enter Your Pin: ");
        Scanner sc = new Scanner(System.in);

        int enteredPin = sc.nextInt();

        if (enteredPin == pin) {
            menu();
        } else {
            System.out.println("Enter a valid Pin");
            checkPin();
        }
    }

    public void menu() {
        System.out.println("\nEnter your choice:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();

        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            System.out.println("Thank You!");
            return;
        } else {
            System.out.println("Enter a valid choice");
            menu();
        }
    }

    public void checkBalance() {
        System.out.println("Balance: " + balance);
        menu();
    }

    public void withdrawMoney() {
        System.out.print("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);

        float amount = sc.nextFloat();

        if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance = balance - amount;
            System.out.println("Money Withdraw Successful");
        }

        menu();
    }

    public void depositMoney() {
        System.out.print("Enter Amount to Deposit: ");
        Scanner sc = new Scanner(System.in);

        float amount = sc.nextFloat();

        balance = balance + amount;

        System.out.println("Money Deposited Successfully");
        menu();
    }
}

public class t {
    public static void main(String[] args) {
        Atm obj = new Atm();
        obj.checkPin();
    }
}