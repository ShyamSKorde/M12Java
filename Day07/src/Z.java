class A
{
   public void methodX()
   {
     System.out.println("Class X method");
   }
}
class B extends A
{
public void methodY()
{
System.out.println("class Y method");
}
}
class Z extends B
{
   public void methodZ()
   {
     System.out.println("class Z method");
   }
   public static void main(String args[])
   {
     Z obj = new Z();
     obj.methodX(); //calling grand parent class method
     obj.methodY(); //calling parent class method
     obj.methodZ(); //calling local method
     System.out.println("program for Multilevel inheritance");
  }
}