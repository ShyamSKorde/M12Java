public class Student1 
{
	int RollNo;
	String Name;
	double SGPA; 
	public void show(int RollNo,String Name, double SGPA) 
	{ 
		this.RollNo = RollNo;
		this.Name = Name;
		this.SGPA = SGPA; 
	}
	public void setRollNo(int RollNo)
	{
		this.RollNo = RollNo;
	}
	public int getRollNo()
	{
		return RollNo;	
	}
	public void setName(String Name)
	{
		this.Name = Name;
	}
	public String getName()
	{
		return Name;	
	}
	public void setSGPA(double SGPA)
	{
		this.SGPA = SGPA;
	}
	public double getSGPA()
	{
		return SGPA;	
	}
    public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student1 Stud = new Student1();
        Stud.show(110, "Ravindra", 9.47); 
        System.out.println("Student RollNo is"+"  "+Stud.getRollNo());
        System.out.println("Student Name is"+"  "+Stud.getName());
        System.out.println("Student SGPA is"+"  "+Stud.getSGPA());
        System.out.println("------------");
        System.out.print(Stud.getRollNo()+"  "+Stud.getName()+"  "+Stud.getSGPA());
	}

}