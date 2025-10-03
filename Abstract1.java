abstract class A6	//abstract class
{
public int x,y;
private void fun1()
{
System.out.println(x);
System.out.println(y);
}
abstract void fun2();
}
class A7 extends A6	//extends with parent class
{
int z;
void fun1()
{
System.out.println(z);
}
void fun2()	//overloading function
{

}
}

class Abstract1
{
public static void main(String[] args)
{
A7 a1=new A7();
a1.x=5;
a1.fun1();
a1.y=6;
a1.fun1();
a1.z=7;
a1.fun2();
}
}