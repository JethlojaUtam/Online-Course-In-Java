interface Box2		//interface is class
{
int x=6;
void fun1();		//interface function is not body
static void fun2()
{
System.out.println(x);
}
}
interface Box3 extends Box2	//extends with parent class
{
int y=2;
void fun3();		//interface function is not body		
}
class Box4 implements Box3	//implements with child class
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

class InterfaceClassMix
{
public static void main(String[] args)
{
Box4 b1=new Box4();
b1.fun1();
Box2.fun2();
b1.fun3();
System.out.println(b1.y);
}
}
