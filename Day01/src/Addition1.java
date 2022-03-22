import java.util.Scanner;

public class Addition1 
{

	public static void main(String[] args) {
		
		int a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		a = sc.nextInt();
		
		System.out.println("Enter Second Number: ");
		b = sc.nextInt();
		
		
		c = a + b;
		System.out.println("The Sum of these numbers: "+c);
		System.out.println("Enter A Number: ");
		int A = sc.nextInt();
        System.out.println("Enter B Number: ");
		int B = sc.nextInt();
		 int C = A/B;
		System.out.println("Result"+" "+C);
		sc.close();

	}

}
