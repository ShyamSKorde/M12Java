      /* 1) object putifAbsent(Object Key , Object Value)
       * to add entry to the Map if the specified key is not already available if available than no add
       */


package com.java.concurrentcollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap1 
{

	public static void main(String[] args) 
	{
		 ConcurrentHashMap m = new ConcurrentHashMap();
		 m.put(101, "Shyam");
		 m.put(101, "Ram"); //replace old 
		 System.out.println("Put method " +m); //[101 , "Ram"]
		 m.putIfAbsent(101, "Shivam");  //not replace old value
		 System.out.println("putIFAbsent method " +m); //[101 , Ram]
		 
	}

}
