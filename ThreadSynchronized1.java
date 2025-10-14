import java.util.Scanner;

// Updated class name to Account (was Account1)
class Account {
    int balance;

    Account(int bal) {
        balance = bal;
    }

    // Return boolean instead of int for clarity
    public boolean isSufficientBal(int withdraw) {
        return balance > withdraw;
    }

    // Removed second parameter – only int needed
    public void withdraw(int withdraw) {
        balance = balance - withdraw;
        System.out.println("Withdraw Successfully");
        System.out.println("Current Balance is: " + balance);
    }
}

// Customer class using Runnable
class Customer1 implements Runnable {
    Account h1;
    String name;

    Customer1(Account g1, String s1) {
        h1 = g1;
        name = s1;
    }

    public void run() {
        synchronized (h1) {
            Scanner s1 = new Scanner(System.in);
            System.out.println(name + " Enter amount:");
            int amt = s1.nextInt();
            if (h1.isSufficientBal(amt)) {
                System.out.println(name + " has sufficient balance");
                h1.withdraw(amt);
            } else {
                System.out.println(name + " Insufficient Balance");
            }
        }
    }
}

// Main class
public class ThreadSynchronized1 {
    public static void main(String[] args) {
        Account a1 = new Account(5000);           // Now using Account
        Customer1 c1 = new Customer1(a1, "User1"); // Customer 1
        Customer1 c2 = new Customer1(a1, "User2"); // Customer 2

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
