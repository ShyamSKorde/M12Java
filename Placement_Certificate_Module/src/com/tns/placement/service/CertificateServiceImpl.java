package com.tns.placement.service;

import com.tns.placement.entities.Certificate;
import com.tns.placement.repository.CertificateRepositoryImpl;
import com.tns.placement.repository.ICertificateRepository;

public class CertificateServiceImpl implements ICertificateService
{
	private ICertificateRepository dao;
	
	
    
	public CertificateServiceImpl()
	{
		dao = new CertificateRepositoryImpl();
	}

	@Override
	public Certificate addCertificate(Certificate certificate) 
	{
		dao.beginTransaction(); 
		dao.addCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate updateCertificate(Certificate certificate) {
		dao.beginTransaction();
		dao.updateCertificate(certificate);
		dao.commitTransaction();
		return certificate;
	}

	@Override
	public Certificate searchCertificate(int id) {
		Certificate  certificate = dao.searchCertificate(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(int id) 
	{
		Certificate  certificate = dao.deleteCertificate(id);
		return certificate;
	}

	@Override
	public Certificate deleteCertificate(Certificate certificate)
	{
		dao.beginTransaction();
	    dao.deleteCertificate(certificate);
	    dao.commitTransaction();
		return certificate;
	}
	
}
