                   /* Perform Multiple Task form Multiple Thread */
class Test3 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		    System.out.println("Performing Multiple Task for multiple Thread " +i);
		}
	}
}
class Test4 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		    System.out.println("Performing Multiple Task for multiple Thread ****" +i);
		}
	}
}
public class Thread3 {

	public static void main(String[] args) 
	{
		Test3 T1 = new Test3();
		Test4 T2 = new Test4();
		T1.start(); // 2 Thread to perform 2 Task 
		T2.start();
	}

}
