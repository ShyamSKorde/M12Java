
public class BetwiseOperator 
{
	public static void main(String []args)
	{
		int num1 = 5;
		int num2 = 7;
		int num3 = 0;
		System.out.println(num1&num2);
		System.out.println(num1|num2);
		System.out.println(num1^num2);
		System.out.println(~num1+" "+~num2+" "+~num3);
		num3 = num1>>2;
		System.out.println(num3);
		num3 = num2>>2;
		System.out.println(num3);
		num3 = num1<<2;
		System.out.println(num3);
		num3 = num2<<2;
		System.out.println(num3);
		
		
		
	}

}
