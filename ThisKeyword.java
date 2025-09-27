class Example2
{
private int x,y;
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

class ThisKeyword
{
public static void main(String[] args)
{
Example2 e1=new Example2();
e1.fun1(55,66);
e1.display();
}
}