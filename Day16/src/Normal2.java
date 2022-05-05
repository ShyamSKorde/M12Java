public class Normal2 
{
	public static void main(String[] args)
	{
		Normal2 N2 = new Normal2();
		try
		{
		    N2.Divide();
		}
		catch(Exception e)
		{
			System.out.println(e);//e.printStackTrace();
		}
		System.out.println("sbdndck");
	}
	void Divide()
	{
		int a= 100, b = 0, c; 
		c = a/b;
		System.out.println(c);
		//System.out.print("not use try &catch than run it" );

		/*try
		{
		int a= 100, b = 0, c; 
		c = a/b;
		System.out.println(c);
		//System.out.print("not use try &catch than run it );
		}
		catch(Exception t)
		{
			System.out.println(t); // t.printStackTrace();		
		}
		System.out.println("ggdhdhj;");*/
	}

}
/* try{} and catch(){} by using main method(collar)and another Divide method out try only those method exception occur its method handle not any other*/