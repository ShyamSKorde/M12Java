public class Student2
{
	int sid;
	String sname;
	double sgpa;
	String sbranch;
	void insertRecord(int si, String sn, double sg, String sb){
		this.sid = si;
		this.sname = sn;
		this.sgpa = sg;
		this.sbranch = sb;	
	}
	void display5() 
	{
		System.out.println(sid+" "+sname+" "+sgpa+" "+sbranch);
	}

public class stud
{
	public static void main(String args[])
	{ 

		System.out.println("Welcome in M12 batch ");
	
		
		Student2 s1=new Student2();  
		Student2 s2=new Student2();  
		  s1.insertRecord(1,"Akbar",8.8,"MCA");  
		  s2.insertRecord(2,"Asad",8.5,"MBA");  
		  s1.display5();  
		  s2.display5();  
		  }  
	}
}