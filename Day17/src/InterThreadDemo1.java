class Interthread1 extends Thread 
{
	int total = 0;
	public void run()
	{
		synchronized(this)
		{
			for(int i = 1;i<=10;i++)//10 time loop execute i.e 10 seats 
			{
				total=total+100;//0+100=100,100+100=200..so on 1000 
				//System.out.println(total);//no 
			}
			this.notify();
			//this.notifyAll();
		}
	}
		
}
public class InterThreadDemo1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		Interthread t1 = new Interthread();
		t1.start();
		synchronized (t1)
		{
			t1.wait();
		}
		System.out.println("Total earning : " +t1.total+ " Rs");

	}
	
}
/*  */