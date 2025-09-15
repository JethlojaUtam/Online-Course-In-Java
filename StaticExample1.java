class Area
{
static void fun1()
{
System.out.println("Area A");
}
static void fun2()
{
System.out.println("Area B");
}
}

class StaticExample1
{
static void fun1()
{
System.out.println("B");
}
static void fun2()
{
System.out.println("C");
}
public static void main(String[] args)
{
System.out.println("A");
Area.fun1();
Area.fun2();
}
}