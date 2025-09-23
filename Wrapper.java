class Wrapper		//Wrapper class is convert in string to integer
{
public static void main(String[] args)
{
int x=Integer.parseInt("123.00");	//convert to integer
System.out.println(x);

Integer i1=Integer.valueOf("1000011",2);	//convert to integer
int z=i1.intValue();
System.out.println(z);

Double x1=Double.valueOf("56");		//convert to double
double y=x1.doubleValue();
System.out.println(y);
}
}