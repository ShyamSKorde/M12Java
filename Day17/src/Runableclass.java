                  /* By Implementing Runnable interface */

class MyRunnable1 implements Runnable // Runnable is a interface so used implements 
{
	public void run()// override run method, only one method is available in run method 
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Shyam " +i);
		}
	}
}
public class Runableclass 
{
	public static void main(String[] args) 
	{
		MyRunnable1 r1 = new MyRunnable1(); // class object because, not call run method by Runnable interface 
		//r1.start();
		Thread t1 = new Thread(r1); // create a object on thread class and pass the reference to the class(used implement class) than start thread 
		t1.start();//start() is not Runnable interface method and start method not call to run method, its available in thread class method  
		for(int i=1;i<=5;i++)
		{
			System.out.println("Ram " +i);
		}
		// TODO Auto-generated method stub

	}

}
// without created thread object not call run method and not pass as reference of implemented call not call so create object and pass reference of class object  
/* Steps :- By implementing Runnable Class
 * 1) implement the runnable interface  
 * 2) override run method 
 * 3) creating object of class(User implement or create class)
 * 4) creating the object of Thread class and pass reference creating object of class(User implement or create class i.e step 4) as parameter
 * 5) invoke the thread start() 
 * */ 