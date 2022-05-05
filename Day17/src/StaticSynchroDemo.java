      /* static level synchronization */
      /* synchronize method and block apply on object lock 
       * static class object lock multiple object */
class BookSeat3
{
	static int total_seat = 20;//not static than error becouse veriable used static area 
	static synchronized void BookSeats3(int Seats)//only one object thread is allowed (synchronized static void BookSeats3(int Seats)/ static synchronized void BookSeats3(int Seats)) 
	//int total_seat = 20;
	//synchronized void BookSeats3(int Seats)
	{
		System.out.println(Thread.currentThread().getName());
		if(total_seat>=Seats)
		{
			System.out.println("Seats book successfully : " +Seats);
			total_seat = total_seat-Seats;
			System.out.println("Seats left : " +total_seat);
		}
		else
		{
			System.out.println("Sorry Seats cannot be booked");
			System.out.println("Seats left : " +total_seat);
		}
	}
}
class SynchroThread1 extends Thread 
{
	BookSeat3 b; //referance veriable access value in main method 
	int Seats;
	SynchroThread1(BookSeat3 b, int Seats)//constructor paramerize 
	{
		this.b = b;
		this.Seats = Seats; //this is used to refers to the current class instance veriable  
	}
	@SuppressWarnings("static-access")
	public void run()
	{
		b.BookSeats3(Seats);
	}
}
class SynchroThread2 extends Thread 
{
	BookSeat3 b; //referance veriable 
	int Seats;//value 4
	SynchroThread2(BookSeat3 b, int Seats)//constructor paramerize //value 2
	{
		this.b = b;//value 3
		this.Seats = Seats; //this is used to refers to the current class instance veriable  
	}
	@SuppressWarnings("static-access")
	public void run()
	{
		b.BookSeats3(Seats);
	}
}
public class StaticSynchroDemo  
{
	public static void main(String[]args)
	{
		BookSeat3 obj1 = new BookSeat3(); //object 
		SynchroThread1 t1 = new SynchroThread1(obj1,8);//value 1creatr object/thread and pass object referance 
		t1.setName("t1 Thread ");
		t1.start();
		SynchroThread2 t2 = new SynchroThread2(obj1,8);//obj go parameterize than access this than initilize veriable b.booksheat3 call BookSeats3 method/resourcess 
		t2.setName("t2 Thread ");
		t2.start();
		
		BookSeat3 obj2 = new BookSeat3();
		SynchroThread1 t3 = new SynchroThread1(obj2,5);
		t3.setName("t3 Thread ");
		t3.start();
		SynchroThread2 t4 = new SynchroThread2(obj2,4);
		t4.setName("t4 Thread ");
		t4.start();
		
	}
}
/* block and methode level synchronization case ocure the object level lock every object is 1 lock using lock access reources 
 * but static synchronization is a class level, obj lock same as class lock  
 * multiple object create than again problem(object obj1 and obj2 thread interface) is occurs incorrect output, Data inconsistency, Thread Interference and its main Disadvantages of synchronization/method/block so in this problem used static */ 