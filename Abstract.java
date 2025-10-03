abstract class A4	//abstract class
{
int x,y;
void fun1()
{
System.out.println(x);
System.out.println(y);
}
}
class A5 extends A4	//extends with parent class
{
int z;
void fun2()
{
System.out.println(z);
}
}

class Abstract
{
public static void main(String[] args)
{
A5 a1=new A5();
a1.x=5;
a1.fun1();
a1.y=6;
a1.fun1();
a1.z=7;
a1.fun2();
}
}