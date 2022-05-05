public class Normal 
{
	public static void main(String[]args)
	{
		/*int a= 100, b = 0, c; 
		c = a/b;
		System.out.println("addition ;= "+c);
		System.out.println("Hello");
		//Explanation:- execute top to bottom and exception occur c = a/b(L No 6) than create object by method this time create object by Main() Method Because Exception occur in Main() method
		// object :- Exception class name, Description,StackTrace And provide JVM than JVM check exception exception handle or not by using main method 
		//yes ;- execute program and get output & No :- terminate Abnormally main() method and JVM provide the object Default Exception Handler than object print(Detail) it method abnormally terminate
		*/
		// handle using try{...code...}catch(exception e){....msg...}
		Normal N = new Normal();
		N.Divide();// main method handle using try{...code..N.Divide();...}catch(exception e){....msg...}
	}
	void Divide()
	{
		int a= 100, b = 0, c;
		c = a/b;
		System.out.println(c);// divide method handle using try{...code...}catch(exception e){....msg...}
		System.out.println("Hello");
		//Explanation:- execute top to bottom and create object  Normal class than Call the method N.Divide(); 
		//than c = a/b; exception Occur than create object by method. object :- Exception class name, Description(MSG),StackTrace(Location), this time create object by Divide() Method
		//Because Exception occur in divide() method And provide JVM than JVM check exception exception handle or not by using Divide() method  
		//yes ;- execute program and get output & No :- terminate Abnormally Divide() method than caller method its main() method Exception handler or not yes:- execute program, No:- terminate Abnormally main() method and JVM provide the object Default Exception Handler than object print(Detail) it method abnormally terminate
		
	}

}
