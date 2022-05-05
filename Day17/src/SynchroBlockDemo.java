        /* block Level Synchronization synchronized(this) :- synchronized(object referance expression) */
class BookSeat2 
{
	int total_seat = 10;
	//synchronized void BookSeats2(int Seats)//5
	void BookSeats2(int Seats)//5
	{
		System.out.println("A1" +Thread.currentThread().getName());
		synchronized(this)//this can be used as an object Referance, this is used to point the current object referance 
		{
			if(total_seat>=Seats)
			{
				System.out.println("Seats book successfully" +Seats);
				total_seat = total_seat-Seats;
				System.out.println("Seats left" +total_seat);
			}
			else
			{
				System.out.println("Sorry Seats cannot be booked");
				System.out.println("Seats left" +total_seat);
			}
		}
		System.out.println("A1" +Thread.currentThread().getName());
		System.out.println("A1" +Thread.currentThread().getName());
	}
}
public class SynchroBlockDemo extends Thread
{
	static BookSeat2 b; // is reference of BookSeat class
	int Seats; //how many seats book 
	public void run()
	{
		b.BookSeats2(Seats);//5 go
	}

	public static void main(String[] args)
	{
		b = new BookSeat2(); // object of reference, 1 lock,object base lock 
		SynchroBlockDemo S = new SynchroBlockDemo();
		S.Seats = 6;
		S.start();
		SynchroBlockDemo R = new SynchroBlockDemo();
		R.Seats = 5;
		R.start();
		// TODO Auto-generated method stub

	}

}
/* particular code is synchronize than used block level synchronization only some code Synchronize */ 