            /* Performing Single Task for Single Thread */
class Test1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
		    System.out.println("Performing Single Task for Single Thread " +i);
		}
	}
}
public class Thread1 {

	public static void main(String[] args) 
	{
		Test1 T1 = new Test1();
		T1.start();
		//T1.start(); one thread is start only one time try to many time than throws exception IllegalThreadStateException
		// TODO Auto-generated method stub

	}

}
