package com.tns.placement.service;

import com.tns.placement.entities.College;

public interface ICollegeService 
{
	public College addCollege(College college);
    public College updateCollege(College college);
    public College searchCollege(int id);
    public College deleteCollege(College college);
    // public boolean SchedualPlacament(Placement placement);
	College deleteCollege(int id);
}
