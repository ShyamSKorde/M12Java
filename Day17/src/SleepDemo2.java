          /* sleep() & separate multiple thread*/
class SleepTest2 extends Thread 
{
	public void run() // throws InterruptedException Exception InterruptedException is not compatible with throws clause in Thread.run()
	{                 
		try
		{
			for (int i=1;i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName()+" :- "+i);
				Thread.sleep(1000);
			}

		}
		catch(InterruptedException e)
		{
			e.printStackTrace(); 
		}
	}
}
class SleepTest3 extends Thread 
{
	public void run() // throws InterruptedException Exception InterruptedException is not compatible with throws clause in Thread.run()
	{                 
		try
		{
			for (int i=1;i<=5;i++)
			{
				System.out.println(Thread.currentThread().getName()+" :- "+i);
				Thread.sleep(1000);
			}

		}
		catch(InterruptedException e)
		{
			e.printStackTrace(); 
		}
	}
}
class SleepTest4 extends Thread 
{
	public void run() // throws InterruptedException Exception InterruptedException is not compatible with throws clause in Thread.run()
	{                 
		try
		{
			for (int i=1;i<=5;i++)
			{
				//Thread.currentThread().setName("Ajay");
				System.out.println(Thread.currentThread().getName()+" :- "+i);
				Thread.sleep(1000);
			}

		}
		catch(InterruptedException e)
		{
			e.printStackTrace(); 
		}
	}
}
public class SleepDemo2 
{
	public static void main(String[]args)throws InterruptedException 
	{
		SleepTest2 t2 = new SleepTest2();
		t2.setName("Shyam");
		t2.start();
		
		SleepTest3 t3 = new SleepTest3();
		t3.setName("Gajanan");
		t3.start();
		
		SleepTest4 t4 = new SleepTest4();
		t4.setName("Ram");
		t4.start();
		 for (int i=1;i<=5;i++)
		 {
			 System.out.println(Thread.currentThread().getName()+" :- "+i);
			 Thread.sleep(1000);//possible to handle try-catch block
		 }
	}

}
