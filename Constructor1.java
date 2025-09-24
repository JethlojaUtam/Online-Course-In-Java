class Demo3
{
int x;
int y;
Demo3()		//Constructor function
{
System.out.println("Constructor 1 excuted");
}
void fun1()
{
System.out.println("Function 1 excuted");
}
}

class Constructor1
{
public static void main(String[] args)
{
Demo3 d1=new Demo3();
d1.fun1();
Demo3 d2=new Demo3();
Demo3 d3=new Demo3();
}
}