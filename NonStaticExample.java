class Mahesh
{
int x;		//instance(object) member varaible
int y;		//instance(object) member varaible
void fun1()		//instance(object) member function
{
System.out.println("fun1");
}
void fun2()		//instance(object) member function
{
System.out.println("fun2");
}
}

class NonStaticExample		//main class
{
public static void main(String[] args)
{
Mahesh m1=new Mahesh();		//object
m1.x=51;
System.out.println(m1.x);	//variable pass

Mahesh m2=new Mahesh();		//object
m2.y=50;
System.out.println(m2.x);	//variable pass

Mahesh m3=new Mahesh();		//object
m3.y=50;
System.out.println(m3.y);	//variable pass
}
}