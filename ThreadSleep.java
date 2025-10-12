class Process3 extends Thread
{
public void run()	//overriding runnable
{
int i;
for(i=1;i<=10;i++)
{
System.out.println("From Process3:"+i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{

}
}
System.out.println("Exit From Process3");
}
}
class Process4 extends Thread
{
public void run()	//overriding runnable
{
int i;
for(i=1;i<=10;i++)
{
System.out.println("From Process4:"+i);
try
{
Thread.sleep(1000);
}
catch(Exception e)
{

}
}
System.out.println("Exit From Process4");
}
}

class ThreadSleep
{
public static void main(String[] args)
{
Process3 p1=new Process3();
Process4 p2=new Process4();
p1.start();
p2.start();
try
{
p1.join();
p2.join();
}
catch(Exception e)
{
System.out.println(e);
}
}
}