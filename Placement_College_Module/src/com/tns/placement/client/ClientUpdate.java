
                       /* update Data in database */

package com.tns.placement.client;

import com.tns.placement.entities.College;
import com.tns.placement.service.CollegeServiceImpl;
import com.tns.placement.service.ICollegeService;

public class ClientUpdate 
{

	public static void main(String[] args)
	{
		
		College college = new College();
		
		ICollegeService service = new CollegeServiceImpl();
		
		// perform update operation to the database 
		
		
		  
				college = service.searchCollege(101);
				college.setCollegeName("Moden collage");  
				service.updateCollege(college);
				System.out.println("data is update sucessfully.....");
		

	}

}
