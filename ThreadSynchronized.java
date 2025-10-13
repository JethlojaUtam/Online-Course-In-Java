import java.util.Scanner;	//user define object class
class Account		//class
{
int balance;
Account(int b)		//costructor
{
balance=b;
}
Boolean isSufficientBal(int withdraw)		//Boolean function
{
if(balance>withdraw)		//if..else condition
{
return true;
}
else
{
return false;
}
}
void withdraw(int amount, String g1)		//variable pass
{
balance=balance-amount;
System.out.println(g1+" Transaction Successfully");
System.out.println(g1+" Currect Balance is:"+balance);
}
}
class Customer implements Runnable	//thread class
{
Account x1;
String m1;
Customer(Account j1, String h1)
{
x1=j1;
m1=h1;
}
public void run()
{
Scanner s1=new Scanner(System.in);	//object of scanner class
synchronized(x1)	//using synchronized
{
System.out.print("Enter the amount to withdraw for "+m1+":");		//using user output
int amount=s1.nextInt();
if(x1.isSufficientBal (amount))		//if..else condition
{
x1.withdraw(amount,m1);
}
else
{
System.out.println("Insufficient Balance");
}
}
}
}

class ThreadSynchronized	//main class
{
public static void main(String[] args)
{
Account a1=new Account(5000);		//object Account
Customer c1=new Customer(a1,"Amit");	//object Customer 1
Customer c2=new Customer(a1,"Sumit");	//object Customer 2
Thread t1=new Thread(c1);
Thread t2=new Thread(c2);
t1.start();
t2.start();
}
}