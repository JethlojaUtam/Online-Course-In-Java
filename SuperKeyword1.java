class Example5
{
int x,y;
void fun1(int x, int y)
{
this.x=x;	//this keyword
this.y=y;	//this keyword
}
void display()
{
System.out.println(x);
System.out.println(y);
}
}
class Example6 extends Example5		//exdend with parent class
{
int x,y;
void fun2(int x, int y)
{
super.x=x;	//super keyword 
super.y=y;	//super keyword
}
void fun3()
{
System.out.println(super.x);	//super keyword with variable
System.out.println(super.y);	//super keyword with variable
}
}

class SuperKeyword1
{
public static void main(String[] args)
{
Example6 e1=new Example6();
e1.fun1(5,6);
e1.display();
e1.fun2(7,9);
e1.fun3();
}
}