                /* Set Interface */

package com.java.Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo 
{

	public static void main(String[] args) 
	{
		Set S = new HashSet();
		System.out.println(S.size());
		S.add(100);
		S.add(200);
		S.add(300);
		S.add(400);
		S.add(null);
		S.add(null);
		//System.out.println(S);
		Iterator itr = S.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());//one by one elements iterat
			//while(itr.hashCode())
		}
		System.out.println(S.size());
	}
}

/* Set :- Dont Duplicate, Order Is not preserved (Dont want) go Set */