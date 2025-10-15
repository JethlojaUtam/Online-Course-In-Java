import java.util.Scanner;

// Account1 class
class Account1 {
    int balance;

    Account1(int bal) {
        balance = bal;
    }

    public int isSufficientBal(int withdraw) {
        if (balance >= withdraw) {
            return 1;
        } else {
            return 0;
        }
    }

    public void withdraw(int withdraw) {
        balance = balance - withdraw;
        System.out.println("Withdraw Successful");
        System.out.println("Current Balance is: " + balance);
    }
}

// Customer1 class implementing Runnable
class Customer1 implements Runnable {
    Account1 h1;
    String name;

    Customer1(Account1 g1, String s1) {
        h1 = g1;
        name = s1;
    }

    public void run() {
        synchronized (h1) {
            Scanner s1 = new Scanner(System.in);
            System.out.println(name + " - Enter amount:");
            int amt = s1.nextInt();

            if (h1.isSufficientBal(amt) == 1) {
                System.out.println(name + " has sufficient balance");
                h1.withdraw(amt);
            } else {
                System.out.println(name + " - Insufficient Balance");
            }
        }
    }
}

// Main class
public class ThreadSynchronized2 {
    public static void main(String[] args) {
        Account1 a2 = new Account1(5000);      // Account1 object with initial balance
        Customer1 c1 = new Customer1(a2, "User1");  // Customer 1
        Customer1 c2 = new Customer1(a2, "User2");  // Customer 2

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
