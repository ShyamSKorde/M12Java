class over extends Overriding
{
	void show()
	{
		System.out.println("overriding show method 1");
	}
}
class overr extends Overriding
{
	String show()
	{
		return "overriding show method 2";
	}
}
public class Overriding 
{

	public static void main(String[] args) 
	{
		over obj = new over();
		obj.show();
		overr obj1 = new overr();
		System.out.println(obj1.show());
		overri obj2 = new overri();
		obj2.show();		// TODO Auto-generated method stub

	}

}
class overri extends Overriding
{
	void show()
	{
		System.out.println("overriding show method 3");
	}
}

