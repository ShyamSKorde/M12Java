                 
                     /* Insert Data in database */

package com.tns.placement.client;

import com.tns.placement.entities.College;
import com.tns.placement.service.CollegeServiceImpl;
import com.tns.placement.service.ICollegeService;

public class ClientInsert 
{
	public static void main(String[] args) 
	{
         College college = new College();
		
		ICollegeService  service = new CollegeServiceImpl();
		
		 // perform  insert operation to the database
		
		
       /*
		college.setId(102);
		college.setUser("Vijay");
        college.setCollegeName("DY.Patil Coolege");
        college.setLocation("Mumbai");
        service.addCollege(college);
        System.out.println("data is added successfully......" );
        */
		
		/* 
        college.setId(103);
		college.setUser("Rajvir");
        college.setCollegeName("MIT College");
        college.setLocation("Aurangabad");
        service.addCollege(college);
        System.out.println("data is added successfully......" );
        */
		
		
         /* 
        college.setId(104);
		college.setUser("Shivam");
        college.setCollegeName("Jadhav College");
        college.setLocation("Washim");
        service.addCollege(college);
        System.out.println("data is added successfully......" );
        */
		
        college.setId(105);
		college.setUser("Aayush");
        college.setCollegeName("SMC College");
        college.setLocation("Risod");
        service.addCollege(college);
        System.out.println("data is added successfully......");  
        
	}

}
