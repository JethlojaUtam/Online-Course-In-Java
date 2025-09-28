class Demo
{
private static int x;		//private varaible
void fun1()	//instance(object) member function
{
x=5;
}
void display()
{
System.out.println(x);
}
}

public class PrivateProgram	//main class
{
public static void main(String[] args)
{
Demo d1=new Demo();	//object
d1.fun1();	//function pass 
d1.display();
}
}