import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStream {

	public static void main(String[] args) {
		InputStreamReader is=new InputStreamReader(System.in);
		System.out.println("Enter number");
		BufferedReader br=new BufferedReader(is);
		try
		{
		int num=Integer.parseInt(br.readLine());
		System.out.println("you have entered :- "+num);
		}
		catch(IOException num)
		{
			System.out.println("you have entered"+num);
		}
		
		}

}