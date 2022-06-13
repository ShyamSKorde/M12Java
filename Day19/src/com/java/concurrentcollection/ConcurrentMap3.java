
                     /* boolean remove(Object Key , Object OldValue , NewValue)
                      * OldValue if the key value Matched than replace with NewValue
                      */

package com.java.concurrentcollection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentMap3 
{

	public static void main(String[] args) 
	{
		 ConcurrentHashMap m = new ConcurrentHashMap();
		 m.put(101, "Shyam");
		 m.put(102, "Ram");
		 System.out.println("Put method " +m); //[101="Shyam" ,102="Ram"]
		
		 m.replace(101, "Sumesh" , "Mayur"); // Key Value not match with key so value not Replace 
		 System.out.println("Replace method " +m);   //[101="Shyam" ,102="Ram"]
		
		 m.replace(102, "Ram" , "Gajanan"); // Key value match with key so Replace Value
		 System.out.println("replace method " +m); //[101=Shyam, 102=Gajanan]
		 
	}

}