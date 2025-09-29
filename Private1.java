class Example1
{
private int x;
private int y;
void fun1(int x, int y)
{
//x=p;
//y=q;
x=x;
y=y;
}
void display()
{
System.out.println(x);
System.out.println(y);
}
}

public class Private1
{
public static void main(String[] args)
{
Example1 e1=new Example1();
e1.fun1(2,3);
e1.display();
}
}