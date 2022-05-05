
class abc extends Thread
{
	public void run()
	{ 
		//System.out.println(Thread.currentThread().getName());
		String n = Thread.currentThread().getName();
		System.out.println(n);
	}
}
public class ThreadName111
{

	public static void main(String[] args)
	{
		abc t1 = new abc();
		abc t2 = new abc();
		abc t3 = new abc();
		t1.setName("Shyam");
		t1.start();
		t2.setName("Ram");
		t2.start();
		t3.start();
		// TODO Auto-generated method stub

	}

}
