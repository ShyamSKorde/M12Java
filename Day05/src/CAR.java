public class CAR {
//member variables
//member methods
int noofcars; //student class --->variables intsid,String sname,float sgpa,String sbranch
String Model;
int speed;
public void setSpeed(int S) // setSpeed Method 
{
this.speed=S;
}
public int getSpeed() //GetSpeed Method
{
return speed;
}
void display() // Method 
{
System.out.println("Welcome to Kia-Motors");
}
public static void main(String[] args) 
{
//object creation
CAR obj=new CAR(); // Object 
obj.display();
 obj.setSpeed(80);
 System.out.println("Speed is := "+" "+obj.getSpeed());
}
}