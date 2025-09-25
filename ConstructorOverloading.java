class Demo5
{
int x;
int y;
Demo5()
{

}
Demo5(int z)
{
x=z;
}
Demo5(int p, int q)
{
x=p;
y=q;
}
}

class ConstructorOverloading
{
public static void main(String[] args)
{
Demo5 d1=new Demo5();
Demo5 d2=new Demo5(4);
Demo5 d3=new Demo5(5,6);
}
}