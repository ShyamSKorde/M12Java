          /* Synchronization :- problem in multithreading and solve these problem using  synchronization */
          /* Method level Synchronization */
class BookSeat 
{
	int total_seat = 10;
	 void BookSeats(int Seats)
	//synchronized void BookSeats(int Seats)//5
	{
		if(total_seat>=Seats)//booking seats is total_seat greater than equal to print seats successfully otherwise else block
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
}
//all method is synchronize 
public class SynchroDemo extends Thread
{
	static BookSeat b; // is reference of BookSeat class
	int Seats; //how many seats book 
	public void run()
	{
		b.BookSeats(Seats);//5 go
	}

	public static void main(String[] args) 
	{
		 b = new BookSeat(); // object of reference, 1 lock, object base lock 
		 SynchroDemo S = new SynchroDemo();
		S.Seats = 5;
		S.start();
		SynchroDemo R = new SynchroDemo();
		R.Seats = 5;
		R.start();

	}

}
/*  in multithreading S,R access BookSeat resources at same time to problem is occurs incorrect output, Data inconsistency, Thread Interference and its main Disadvantages of multithreading so in this problem used Synchronization (synchronized) 
 *  Synchronization :- (Defination) it is process by which control the accessability of multiple threads to a particular shared resource 
 *  every object 1 lock 2 areas non-Synchrinization and synchronization block 2thread access resourceses     
 *  every objct one lock, every object 2 area non-Synchrinization and synchronization 
 *  synchronization block access thred and 1 thread access resources that time another thread waiting onces complate work lock release than 2 thread access x*/ 
