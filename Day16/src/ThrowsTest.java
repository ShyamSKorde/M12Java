//Syntex :- Method() throws exception class name 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
class ReadandWrite
{
	void ReadFile()throws FileNotFoundException // its used for after method not inside(throw) method than provide class name not used try-catch  //read method read the file data than used FileInputStream it's class name  
	                                            //throws keyword used for indication for the caller method that type of exception may occur atb line /time  (only provide indication to its handle exception that type) 
	{
		FileInputStream Fis = new FileInputStream("d:/abc.txt");//throw FileNotfound exception compile time or checked exception so handle exception try-catch but in case not handle try catch block so used throws keyword
	    //Statements........
	}//}compile it above without throws 
	void Writefile()throws FileNotFoundException 
	{
		String text ="this is demo";
		FileOutputStream Fa = new FileOutputStream("d:/xyz.txt");//not handle but its create file in d drive
		//statement......
	}
}
public class ThrowsTest 
{
	public static void main(String[]args) // not handle manually than used throws keyword its run but its not proper way and not handle exception (throws FileNotFoundException) becose call main method by JVM and JVM create object for FileNotFoundException class than provide DEhandler than main methods terminate but  abnormally terminate main method  so not used try-catch    
	{
		//String name = "this progrm is throws demo";
		ReadandWrite rw = new ReadandWrite();
		
		 // call  Readfile(); method
		try
		{
		 rw.ReadFile(); //we used this method than throws keyword indicate caller means main() method to throw FileNoteFoundException may be occur than handle it 
		 //not acceptable rw.Writefile();
		 }
		catch(FileNotFoundException r)
		{
			r.printStackTrace();
		}
		//rw.Writefile();
		try
		{
			rw.Writefile();//exception not throws but create file 
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.print("successfullayyyy......");
		
	}

}
