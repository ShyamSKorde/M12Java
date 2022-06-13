package com.tnsif.collection;

import java.util.ArrayList;

public class G2 
{
	public static void m1(ArrayList i)
	{
		i.add(10);
		i.add(10.8);
		i.add(true);
		System.out.println("Non generics object  " +i);
	}

	public static void main(String[] args) 
	{
		ArrayList<String> l1 = new  ArrayList<String>();
		l1.add("ABVP");
		l1.add("XYZ");
		//l1.add(10); //trying to add l1 List get CTE
		System.out.println("generic object " +l1);
		
		m1(l1);  //m1 add in l1, -send non generic object to generic object  
		System.out.println("Communication with generic to non-generic code");
		System.out.println(l1);
		
		//l1.add(10); // trying to add l1 list get CTE
		

	}

}
