             /*Why used multithreading By using Extending Thread class */
class MyThread2 extends Thread
{
	public void run()// not throws because its override method but handle exception try/catch block & normally method is used than throws used  
	{
		try 
		{
			int i;
			for(i=1;i<=5;i++)
			{
				System.out.println("Shyam " +i);
				Thread.sleep(1000);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
public class Threadclass1 {

	public static void main(String[] args) throws InterruptedException // throws and try catch used 
	
	{
		MyThread2 t1 = new MyThread2();
		//t1.run(); & t1.fun();
		t1.start();
		int i;
		for(i=1;i<=5;i++)
		{
			System.out.println("Ram " +i);
			Thread.sleep(1000);
		}
		// TODO Auto-generated method stub

	}

}
//sleep() :- purpose put the into temporary waiting state and throws checked exception i.e InterruptedException
//run() or Normal method :- in this program used fun method and on main thread once the fun method work done than main method start and done so used than time is more, waiting time to another thread, but used thread same time 2 thread execute time less, not waiting time    