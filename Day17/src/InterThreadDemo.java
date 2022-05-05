             /*Inter Thread communication */ 
class Interthread extends Thread 
{
	int total = 0;
	public void run()
	{
		for(int i = 1;i<=10;i++)//10 time loop execute i.e 10 seats 
		{
			total=total+100;//0+100=100,100+100=200..so on 1000 
			//System.out.println(total);//no 
		}
	}
		
}
public class InterThreadDemo 
{

	public static void main(String[] args) 
	{
		Interthread t1 = new Interthread();
		t1.start();
		System.out.println("Total earning : " +t1.total+ " Rs");
		

	}
}
/* main and t1 thread execute sane time but ti thread execute that time main thread execution complate so wrong output print 0 Rs becuse 
 * print veriable value  */
