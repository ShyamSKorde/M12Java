class Parent3
{
	void M1()
	{
		System.out.println("Parent class method");
	}
}
class Child1 extends Parent3
{
	void M2()
	{
		System.out.println("Child1 Class method extends on Parent class");
	}
}
class Child2 extends Parent3
{
	void M3()
	{
		System.out.println("Child2 class method extends on Parent class");
	}
}
class CHILD5 extends Parent3
{
	void M4()
	{
		System.out.println("Child3 class method extends on Parent class");
	}
}
class Child4 extends Parent3
{
	void M5()
	{
		System.out.println("Child4 class method extends on Parent class");
	}
}
public class Hierarchical123
{
	public static void main(String[] args) 
	{
		Child1 AB0 = new Child1();
		Child2 AB1 = new Child2();
		CHILD5 AB2 = new CHILD5();
		Child4 AB3 = new Child4();
		AB0.M2();
		AB1.M3();
	    AB2.M4();
	    AB3.M5();
	    AB0.M1();
		AB1.M1();
	    AB2.M1();
	    AB3.M1();
		// TODO Auto-generated method stub

	}

}
