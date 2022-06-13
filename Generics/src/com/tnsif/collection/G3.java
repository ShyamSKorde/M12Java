

package com.tnsif.collection;

import java.util.ArrayList;

public class G3 
{
	public static void main(String[] args) 
	{
		//non obj            //generic obj
		   
		ArrayList l1 = new  ArrayList<String>();
		l1.add(29);
		l1.add("abc");
		l1.add(28.8);
		System.out.println("Communication with non-generic to generics code " +l1);
	}

}

