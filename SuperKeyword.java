class Example3
{
int x,y;
void fun1(int x, int y)
{
this.x=x;
this.y=y;
}
void display()
{
System.out.println(x);
System.out.println(y);
}
}
class Example4 extends Example3
{
int x,y;
void fun2(int x, int y)
{
super.x=x;
super.y=y;
}
void fun3()
{
System.out.println(x);
System.out.println(y);
}
}

class SuperKeyword
{
public static void main(String[] args)
{
Example4 e1=new Example4();
//e1.fun1(1,2);
//e1.display();
e1.fun2(7,9);
//e1.fun3();
e1.display();
}
}