package com.tns.placement.repository;

import com.tns.placement.entities.Placement;

public interface IPlacementRepository {

	public abstract void addPlacement(Placement placement);
	
	public abstract void updatePlacement(Placement placement);
	
	public abstract Placement searchPlacement(int id);

	void beginTrancsaction();

	void cancelPlacement(int id);

	void commitTransaction();
}
