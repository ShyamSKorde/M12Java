public class Relational 
{

	public static void main(String[] args) 
	{
		int A = 5;
          if(A != 5)
          {
        	  System.out.println("Value of x is not 5");
        	  
          }
          else
          {
          System.out.println("Value of x is 5");
          }
          int x = 8; int y = 7;
          if(x >= y)
          {
       	   System.out.println("true");
          }
          else
          {
       	   System.out.println("false");
          }
          int a = 10; int b = 11;
		  
		  if(!(a < b) || (a == b))
		  { 
			  System.out.println("Condition is TRUE");
		  }
		  else
		  { 
			  System.out.println("Condition is FALSE"); 
		   }
		  int ageOfBoy = 36;
			int ageOfGirl = 25;

			if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) 
			{
				System.out.println("ready to get married!");
			} 
			else 
			{
				System.out.println("Wait for it kiddo!");
			}

	}
}
