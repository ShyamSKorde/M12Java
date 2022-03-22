public class Variable  
{
	int a = 10; //instance variable 
	static String  b = "Akash"; // Static Variable 
	static boolean c = true ; // Static Variable 
	static int  d = 100; // Static Variable 
    public static void main(String[] args) 
    {
    	float Per  = 71.46f;   // Local Variable 
    	Variable obj = new Variable();  // Object create 
    	System.out.println("Local Variable := "+" "+Per); // local access 
    	System.out.println("Instance Variable:= "+" "+obj.a);// access instance
    	System.out.println("Static Variable:= "+" "+obj.b); // using object access static
    	System.out.println("Static Variable:= "+" "+c);  // Direct access static
    	System.out.println("Static Variable:= "+" "+Variable.d); //using class access Static 
		// TODO Auto-generated method stub

	}

}
