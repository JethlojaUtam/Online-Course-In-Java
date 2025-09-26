interface Box1
{
int x=6;
void fun1();
static void fun2()
{
System.out.println(x);
}
}

class Interface
{
public static void main(String[] args)
{
Box1.fun2();
}
}