class A2
{
void fun1()
{
System.out.println();
}
}
class A3 extends A2
{
void fun1(int z)
{
System.out.println(z);
}
void fun1(int p, int q)
{
System.out.println(p);
System.out.println(q);
}
}

class Overloading
{
public static void main(String[] args)
{
A3 a1=new A3();
a1.fun1();
a1.fun1(5);
a1.fun1(6,7);
}
}