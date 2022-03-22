
public class Overloading1 
{
	public void M1()
	{
		System.out.println("No parameter");
	}
	public void M1(int a)
	{
		System.out.println("One parameter");
	}
	public void M1(int a,int b)
	{
		System.out.println("two parameter");
	}
	public static void main(String[] args) 
	{
		Overloading1 Over = new Overloading1();
		Over.M1();
		Over.M1(10);
		Over.M1(47,78);
		// TODO Auto-generated method stub

	}

}
