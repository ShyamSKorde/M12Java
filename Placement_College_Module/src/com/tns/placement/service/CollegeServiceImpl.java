package com.tns.placement.service;

import com.tns.placement.entities.College;
import com.tns.placement.repository.CollegeRepositoryImpl;
import com.tns.placement.repository.ICollegeRepository;

public class CollegeServiceImpl  implements ICollegeService
{
	private ICollegeRepository dao;
	
	
	
	public CollegeServiceImpl() 
	{
		dao = new CollegeRepositoryImpl();
	}

	@Override
	public College addCollege(College college)
	{
		dao.beginTransaction(); 
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College updateCollege(College college)
	{
		dao.beginTransaction(); 
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
		
		
	}

	@Override
	public College searchCollege(int id) 
	{
		College college = dao.seatchCollege(id);
		return college;
	}
	
	@Override
	public College deleteCollege(College college)
	{
		dao.beginTransaction();
		dao.deleteCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College deleteCollege(int id) 
	{
		College college = dao.deleteCollege(id);
		return college;
	}


	/*@Override
	public College deleteCollege(College college) {
		// TODO Auto-generated method stub
		return null;
	}*/

}
