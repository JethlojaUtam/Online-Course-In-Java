abstract class A8	//abstract class
{
int x,y;
void fun1()
{
System.out.println(x);
System.out.println(y);
}
abstract void fun2();
A8()		//constructor
{
System.out.println("Parent abstract with constructor");
}
}
class A9 extends A8	//extends with parent class
{
int z;
void fun3()
{
System.out.println(z);
}
void fun2()	//overloading function
{

}
A9()		//constructor
{
super();
System.out.println("Child abstract with constructor");
}
}

class AbstractConstructor
{
public static void main(String[] args)
{
A9 a1=new A9();
}
}