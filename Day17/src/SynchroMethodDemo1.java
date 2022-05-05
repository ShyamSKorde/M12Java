              /* Method level Synchronization and Disadvantages  */
class BookSeat1 
{
	int total_seat = 10;
	synchronized void BookSeats1(int Seats)//5
	{
		System.out.println("A1" +Thread.currentThread().getName());
		System.out.println("A1" +Thread.currentThread().getName());
		System.out.println("A1" +Thread.currentThread().getName());
		System.out.println("A1" +Thread.currentThread().getName());
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
		System.out.println("A1" +Thread.currentThread().getName());
		System.out.println("A1" +Thread.currentThread().getName());
		System.out.println("A1" +Thread.currentThread().getName());
		System.out.println("A1" +Thread.currentThread().getName());
	}
}
//Synchronize all method that time waiting time is more for another thread solution is block level Synchronization 
public class SynchroMethodDemo1 extends Thread 
{
	static BookSeat1 b; // is reference of BookSeat class
	int Seats; //how many seats book 
	public void run()
	{
		b.BookSeats1(Seats);//5 go
	}

	public static void main(String[] args)
	{
		b = new BookSeat1(); // object of reference, 1 lock,object base lock  
		 SynchroMethodDemo1 S = new SynchroMethodDemo1();
		S.Seats = 6;
		S.start();
		SynchroMethodDemo1 R = new SynchroMethodDemo1();
		R.Seats = 5;
		R.start();
		// TODO Auto-generated method stub

	}

}
