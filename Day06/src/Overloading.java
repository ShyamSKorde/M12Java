public class Overloading  
{
      public void add(int a,int b) 
      {
          System.out.println("Add is "+(a+b));
      }
      public void add(int p,int q,int r)
      {
          System.out.println("Add is "+(p+q+r));
      }
      public void add(int x,int y,int z,int q)
      {
           System.out.println("Add is "+(x+y+z+q));
      }
     public static void main(String[] args)
      {
	       Overloading ob=new Overloading();
           ob.add(25,34);
           ob.add(78,23,21);
           ob.add(50,38,85,25);
           System.out.println("Method name is same but different Parameter is called Overloading");
      }
}
