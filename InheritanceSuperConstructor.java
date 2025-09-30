class Nokia1
{
private int x,y;
Nokia1(int p, int q)
{
x=p;
y=q;
System.out.println("Parent constructor executed");
}
void display()
{
System.out.println(x);
System.out.println(y);
}
void fun1()
{
System.out.println("Parent function 1 executed");
}
void fun2()
{
System.out.println("Parent function 2 executed");
}
}
class Nokia2 extends Nokia1
{
int z;
Nokia2()
{
super(6,7);
System.out.println("Child constructor executed");
}
void fun3()
{
System.out.println("Child function executed");
}
}

class InheritanceSuperConstructor
{
public static void main(String[] args)
{
Nokia2 n1=new Nokia2();
n1.display();
}
}