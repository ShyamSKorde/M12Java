package com.tns.placement.service;

import com.tns.placement.entities.Placement;
import com.tns.placement.repository.IPlacementRepository;
import com.tns.placement.repository.PlacementRepositoryImpl;

public class PlacementServiceImpl implements IPlacementService{

    private IPlacementRepository dao;
	
	public PlacementServiceImpl() {
		dao = new PlacementRepositoryImpl();
		
	}

	@Override
	public void addPlacement(Placement placement) {
		dao.beginTrancsaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
	}

	@Override
	public void updatePlacement(Placement placement) {
		dao.beginTrancsaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		
	}

	@Override
	public Placement searchPlacement(int id) {
		Placement placement = dao.searchPlacement(id);
		return placement;
		
	}

	@Override
	public void cancelPlacement(int id) {
		 dao.beginTrancsaction();
		 dao.cancelPlacement(id);
		 dao.commitTransaction();
		
	}

	@Override
	public void removePlacement(int id) {
		 dao.beginTrancsaction();
		 dao.cancelPlacement(id);
		 dao.commitTransaction();
	}

	
		
}
