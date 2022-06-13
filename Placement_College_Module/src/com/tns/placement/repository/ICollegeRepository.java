package com.tns.placement.repository;

import com.tns.placement.entities.College;

public interface  ICollegeRepository 
{
	public College addCollege(College college);
	public College updateCollege(College college);
	public College seatchCollege(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	College deleteCollege(int id);
	College deleteCollege(College college);
	
	

}
