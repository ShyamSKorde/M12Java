
class SynchronizationTest extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(Thread.currentThread().getName());
			System.out.println("Shyam" +i);
		}
	}
}
public class MultiDemo
{
	 
	public static void main(String[] args) 
	{
		SynchronizationTest T1 = new SynchronizationTest();
		SynchronizationTest T2 = new SynchronizationTest();
		SynchronizationTest T3 = new SynchronizationTest();
		T1.start();
		T1.setName("A");
		T2.start();
		T2.setName("B");
		T3.start();
		T3.setName("C");
		// TODO Auto-generated method stub

	}

}
