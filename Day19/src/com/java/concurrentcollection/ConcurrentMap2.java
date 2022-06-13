           /* boolean remove(Object Key , Object Value)
            * remove the entry if the key associative with specific value only if not match not remove 
            */
      
package com.java.concurrentcollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap2 
{

	public static void main(String[] args) 
	{
		 ConcurrentHashMap m = new ConcurrentHashMap();
		 m.put(101, "Shyam");
		 m.put(102, "Ram"); //replace old 
		 System.out.println("Put method " +m); //[101="Shyam" ,102="Ram"]
		
		 m.remove(101, "Sumesh"); // value not match with key so not remove 
		 System.out.println("remove method " +m);   //[101="Shyam" ,102="Ram"]
		
		 m.remove(102, "Ram"); // value match with key so remove
		 System.out.println("remove method " +m); //[101=Shyam]
		 
	}

}