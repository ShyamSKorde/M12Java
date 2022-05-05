class Thrownormal 
{
	public static void main(String[]agrs)
	{
		//throw new ArithmeticException();
		//ArithmeticException class create object and pass to JVM and pass by as a programmer Not method provide(main() method not involve object cretation its main() method 
		//but in simple program object create method and provide main method not involve programmer 
		//throw keyword is used to throw the exception by create programmer what is need used for custom exception and user defined exception 
	    try
	    {
		    throw new ArithmeticException("Throws keyword");
	    }
	    catch(Exception e)
	    {
	    	e.printStackTrace();
		    //System.out.println(e);
	    }
	}
     //Syntex:-  throw new keyword Exception calass name("String, Msg");
 }