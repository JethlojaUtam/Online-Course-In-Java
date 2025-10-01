class Nokia1
{
int x;
int y;
Nokia1()
{
System.out.println("Parent constructor excuted");
}
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
Nokia2()
{
System.out.println("Child constructor excuted");
}
void fun3()
{
System.out.println("Child function 1 excuted");
}
}

class InheritanceConstructor
{
public static void main(String[] args)
{
Nokia2 n1=new Nokia2();
}
}