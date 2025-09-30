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
class Nokia3 extends Nokia2
{
int w;
void fun4()
{
System.out.println("Child function 2 excuted");
}
}

class InheritanceMultilevel
{
public static void main(String[] args)
{
Nokia3 n1=new Nokia3();
n1.fun1();
n1.fun2();
n1.fun3();
n1.fun4();
}
}