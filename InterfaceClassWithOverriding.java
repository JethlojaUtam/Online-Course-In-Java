interface Box5		//interface is class
{
int x=6;
void fun1();		//interface function is not body
static void fun2()
{
System.out.println(x);
}
}
interface Box6 extends Box5	//extends with parent interface class
{
int x=9;	//overriding variable
int y=2;
static void fun2()	//function overriding with variable
{
System.out.println(x);
}
void fun3();		//interface function is not body		
}
class Box7 implements Box6	//implements with child class
{
public void fun1()	//function overriding
{
System.out.println("Function 1 overriding");
}
public void fun3()	//function overriding
{
System.out.println("Function 2 overriding");
}
}

class InterfaceClassWithOverriding
{
public static void main(String[] args)
{
Box7 b1=new Box7();
b1.fun1();
Box5.fun2();	//object
Box6.fun2();	//object with overriding function
b1.fun3();
System.out.println(b1.y);
}
}
