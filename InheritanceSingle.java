class Nokia1
{
int x;
int y;
void fun1()
{
System.out.println("Parent function 1 excuted");
}
void fun2()
{
System.out.println("Parent function 2 excuted");
}
}
class Nokia2 extends Nokia1
{
int z;
void fun3()
{
System.out.println("Child function 1 excuted");
}
}

class InheritanceSingle
{
public static void main(String[] args)
{
Nokia2 n1=new Nokia2();
n1.fun1();
n1.fun2();
n1.fun3();
}
}