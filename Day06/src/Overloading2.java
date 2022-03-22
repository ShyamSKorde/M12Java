
public class Overloading2 
{
	public void show(int a)//one parameter 
	{
		System.out.println("Value is"+a);
	}
	public void show(int a, float b)//two parameter 
	{
		System.out.println("Value is "+a+","+"Value is "+b);
	}
	public void show(float b,String x,double a)//three parameter But method name is same 
	{
		System.out.println("Value is "+b+","+"Name is "+x+","+"Value is "+a);
	}
	public static void main(String[]args)
	{
		Overloading2 OBJ = new Overloading2();
		OBJ.show(2);
		OBJ.show(5,36.6f);
		OBJ.show(2.5f,"Shyam",47.89);
	}
}
