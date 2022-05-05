public class Typecasting1 
{
	public static void main(String[]args)
	{
		System.out.println("implicit Type casting conversion Smaller to larger");   
	    int d = 27373;
	    double b = d;
	    System.out.println("implicit Type casting "+b);
	    long l = 3546l;
	    float f = l;
	    System.out.println("implicit Type casting "+f);
	    short s = 3445;
	    int i = s;
	    long L = s;
	    float F = s;
	    double B = s;
	    System.out.println("implicit Type casting:"+" "+ "convrt int :-" +i+" "+ "convrt long :-" +L+" "+ "convert float :-  "+F+" "+"convert double:- "+B);
        System.out.println("implicit Type casting conversion Larger to Smaller");
	    double X =546458.6737;
	    int Q = (int) X;
	    short S = (short) X;
	    byte t = (byte) X;
	    float o = (float) X;
	    long g = (long) X;
	    System.out.println("Explicit Type casting:"+" "+ "convrt int :-" +Q+" "+ "convrt short :-" +S+" "+ "convert byte :-  "+t+" "+"convert float:- "+o+" "+"convert long :- "+g);
    
	}
	

}
