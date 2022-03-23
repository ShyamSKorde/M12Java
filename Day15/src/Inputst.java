import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputst {

	public static void main(String[] args)throws IOException {
		InputStreamReader is=new InputStreamReader(System.in);
		System.out.println("Enter number");
		BufferedReader br=new BufferedReader(is);
		int num=Integer.parseInt(br.readLine());
		System.out.println("you have entered :- "+num);
		
		}

}
