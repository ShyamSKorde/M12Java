class Bank
{ 
     int getRateOfInterest()
     {
          return 8;
     } 
} 
class SBI extends Bank
{ 
      int getRateOfInterest()
      {
            return 7;
      } 
} 
class ICICI extends Bank
{ 
     int getRateOfInterest()
    {
         return 9;
    } 
} 
class AXIS extends Bank
{ 
     int getRateOfInterest()
     {
        return 6;
     } 
} 
public class Banks
{ 
   public static void main(String args[])
   { 
	   Bank B = new Bank();
       SBI s=new SBI(); 
       ICICI i=new ICICI(); 
       AXIS a=new AXIS(); 
       System.out.println("Bank Rate of Interest: "+B.getRateOfInterest());
       System.out.println("SBI Rate of Interest: "+s.getRateOfInterest()); 
       System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest()); 
       System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest()); 
   } 
}