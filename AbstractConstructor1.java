abstract class A10	//abstract class
{
int x,y;
void fun1(int x, int y)
{
this.x=x;
this.y=y;
}
void display()
{
System.out.println(x);
System.out.println(y);
}
abstract void fun2();
A10()		//constructor
{
System.out.println("Parent abstract with constructor");
}
}
class A11 extends A10	//extends with parent class
{
int z;
void fun3(int z)
{
this.z=z;
}
void fun2()	//overloading function
{
System.out.println("Function Overloading executed");
}
void display()
{
System.out.println(z);
}
A11()		//constructor
{
super();
System.out.println("Child abstract with constructor");
}
}

class AbstractConstructor1
{
public static void main(String[] args)
{
A11 a1=new A11();
a1.fun1(4,5);
a1.display();
a1.fun2();
a1.fun3(3);
a1.display();
}
}