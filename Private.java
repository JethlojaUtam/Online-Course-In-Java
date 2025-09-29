class Example
{
private int x;
private int y;
void fun1()
{
x=5;
y=6;
}
void display()
{
System.out.println(x);
System.out.println(y);
}
}

public class Private
{
public static void main(String[] args)
{
Example e1=new Example();
e1.fun1();
e1.display();
}
}