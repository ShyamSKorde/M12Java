class GrandParent
{
	void Show()
	{
		System.out.println("The class is GrantParent: Grandparent");	
	}
}
class Parent1 extends GrandParent
{
	void Show1()
	{
		System.out.println("The Class is extends On Grandparent: Parent");
	}
	
}
public class Child3 extends Parent1 
{
    void Show2()	
    {
    	System.out.println("The class is extends on Parent: Child3");
    }
    public static void main(String[] args)
    {
    	Child3 ch = new Child3();
    	ch.Show();
    	ch.Show1();
    	ch.Show2();
    	System.out.println("program for Multilevel inheritance");
		// TODO Auto-generated method stub

	}

}
