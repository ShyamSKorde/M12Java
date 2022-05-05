public class DemoPropagation 
{
	public static void main(String[] args) 
	{
		//M1();
		try
		{
			M1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Handle by Main Method");
		}
		// TODO Auto-generated method stub
	}
	  static void M1()
	{
		  M2();
		  /*try
		  {
		      M2();
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("Exception Handle by M1() Method");
		  }*/
	}
	static  void M2() 
	{
		System.out.println(10/0);
	}
	/*public static void main(String[] args) 
	{
		DemoPropagation m = new DemoPropagation();
		m.M1();
		// TODO Auto-generated method stub
	}
	  void M1()
	{
		  DemoPropagation m1 = new DemoPropagation();
			m1.M2();
	}
	 void M2() 
	{
		System.out.println(10/0);
	}*/

}
