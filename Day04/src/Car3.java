public class Car3 {
     //Member Variable 
     // Member Function/methods
	int noofcars;
	String Model;
	int Speed;
	public String getModel()
	{
		return Model; 
	}
	public void setModel(String M) 
	{
		this.Model=M;  
	}
	public void setSpeed(int s)
	{
		this.Speed = s;
	}
	public int getSpeed()
	{
		return Speed;
	}
	public static void main(String[] args)
	{ 
		Car3 obj = new Car3(); //Object Creation 
		obj.setModel(" Kia-Motors");
		System.out.println("Car Model is := "+obj.getModel());
		obj.setSpeed(60);
		System.out.print("Kia-Motors Speed is : = "+obj.getSpeed());
		// TODO Auto-generated method stub

	}

}
