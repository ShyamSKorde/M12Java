package com.tns.Client;

import com.tnsif.Application.GSNormalAcc;
import com.tnsif.Application.GSPrimeAcc;
import com.tnsif.Application.GSShopFactory;

public class Client 
{
	public static void main(String[] args)
	{
		//step-a
		GSShopFactory gsshopfactory = new GSShopFactory();
		gsshopfactory.getNewPrimeAccount(111, "Gaju", 1000, true);
		gsshopfactory.getNewNormalAccount(123, "Raju", 3456, 50);
		//step-b
		GSPrimeAcc gsprime = new GSPrimeAcc(111, "Gaju", true);
		gsprime.getAccNo();
		gsprime.getAccNm();
		gsprime.getCharges();
		gsprime.bookProduct(1000);
		gsprime.toString();
		
		GSNormalAcc gsnormal  = new GSNormalAcc(123, "Raju", 3456, 50);
		gsnormal.getAccNo();
		gsnormal.getAccNm();
		gsnormal.getCharges();
		gsnormal.getDeliveryCharges();
		gsnormal.bookProduct(3456);
		gsnormal.toString();
		
	}

}
