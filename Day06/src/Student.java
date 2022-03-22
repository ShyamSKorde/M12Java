class stud1 extends Student
{
	void M1(String Name,int RollNo,float Per)
	{
		System.out.println(Name+" "+RollNo+" "+Per);
	}
}
class stud2 extends Student
{
	void M1(String Name,int RollNo,float Per)
	{
		System.out.println(Name+" "+RollNo+" "+Per);
	}
}
public class Student {

	public static void main(String[] args) 
	{
		stud1 ST = new stud1();
		ST.M1("Rohit",10,67.67f);
		stud2 St = new stud2();
	    St.M1("Virat",30,65.00f);
		// TODO Auto-generated method stub

	}

}
