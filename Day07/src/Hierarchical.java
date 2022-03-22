class X
{
   public void methodA()
   {
      System.out.println("method of Class X is Parent Class : X Parent");
   }
}
class Y extends X
{
   public void methodB()
   {
      System.out.println("method of Class Y is extends on X: Y Child on Parent X");
   }
}
class P extends X
{
  public void methodP()
  {
     System.out.println("method of Class P is extends on X: P child on Parent X");
  }
}
class D extends X
{
  public void methodD()
  {
	  System.out.println("method of Class D is extends on X: D child on Parent X");
  }
}
class Hierarchical 
{
  public static void main(String args[])
  {
	  System.out.println("Main method");
     X obj1 = new X();
     Y obj2 = new Y();
     P obj3 = new P();
     D obj4 = new D();
     //All classes can access the method of class A
     obj1.methodA();
     obj2.methodB();
     obj3.methodP();
     obj4.methodD();
     System.out.println("program for Hierarchical inheritance");
  }
}