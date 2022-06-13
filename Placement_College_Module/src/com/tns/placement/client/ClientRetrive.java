
                      /*Retrive Data from database*/

package com.tns.placement.client;

import com.tns.placement.entities.College;
import com.tns.placement.service.CollegeServiceImpl;
import com.tns.placement.service.ICollegeService;

public class ClientRetrive
{
	public static void main(String []args)
	{
		
           College college = new College();
		
		   ICollegeService  service = new CollegeServiceImpl();
		   
		   // perform Retrive operation to the database
		   
		   /*
		    college = service.searchCollege(102);
			System.out.println("ID is :" +college.getId());
			System.out.println("User is :" +college.getUser());
			System.out.println("CollegeName is :" +college.getCollegeName());
			System.out.println("location is :" +college.getLocation());
			System.out.println("retrieve data is sucessfully.....");
			*/
			
		   
			
			college = service.searchCollege(104);
			System.out.println("ID is :" +college.getId());
			System.out.println("User is :" +college.getUser());
			System.out.println("CollegeName is :" +college.getCollegeName());
			System.out.println("location is :" +college.getLocation());
			System.out.println("retrieve data is sucessfully.....");
			
			
		
	}

}
