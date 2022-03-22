public class Student 
{
	int RollNo; // instance Variable
	String Name;  
	public void display()  // display() method 
	{
		System.out.println(" I am the student of "); 
	}
	public void stud1()  //stud1() Method
	{
		System.out.println("Dr. Babasaheb Ambedkar Marathavada University ");
	}
	public void stud2()          //stud2() Method
	{
		System.out.println("Welcome in M12 Batch");
	}
	public static void main(String[] args)
	{
		Student Std = new Student();// create Object 
		Std.display();
		Std.stud1(); 
		Std.stud2(); 
			// TODO Auto-generated method stub

	}

}