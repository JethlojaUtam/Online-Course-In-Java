class Demo1
{
private static int x;		//private varaible
static void fun1()	//instance(object) member function
{
x=5;
}
static void display()
{
System.out.println(x);
}
}

class PrivateProgram1	//main class
{
public static void main(String[] args)
{
Demo1.fun1();	//function pass
Demo1.display();
}
}