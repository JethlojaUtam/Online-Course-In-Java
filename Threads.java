class Process3 extends Thread
{
public void run()	//overriding runnable
{
int i;
for(i=1;i<=10;i++)
{
System.out.println("Process3:"+i);
}
}
}
class Process4 extends Thread
{
public void run()	//overriding runnable
{
int i;
for(i=1;i<=10;i++)
{
System.out.println("Process4:"+i);
}
}
}

class Threads
{
public static void main(String[] args)
{
Process3 p1=new Process3();
Process4 p2=new Process4();
p1.start();
p2.start();
}
}