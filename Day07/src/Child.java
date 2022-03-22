class Parent
{
     void display()
     {
         System.out.println("parent class");
     }
}
public class Child extends Parent
{
	void display1()
	{
		System.out.println("Child class extends parent");
	}
     public static void main(String[] args) 
     {
          Child ob=new Child();
          ob.display();
          ob.display1();
          System.out.println("program for single inheritance");
      }
}
