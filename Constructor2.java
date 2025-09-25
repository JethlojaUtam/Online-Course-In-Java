class Demo4
{
int x;
int y;
Demo4()		//Constructor function
{
x=5;
y=6;
}
void fun1()
{
x=22;
y=23;
}
}

class Constructor2
{
public static void main(String[] args)
{
Demo4 d1=new Demo4();
//d1.fun1();
System.out.println(d1.x);
System.out.println(d1.y);
}
}