package com.tnsif.Application;

import com.tnsif.Framework.ShopFactory;

import com.tnsif.Framework.PrimeAcc;
import com.tnsif.Framework.NormalAcc;
public class GSShopFactory implements  ShopFactory 
{
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean b)
	{
		GSPrimeAcc gsprime = new GSPrimeAcc(accNo, accNm, b);
		return gsprime;
	}
	public NormalAcc getNewNormalAccount(int accNo, String accNm,float charges, float deliveryCharge) 
	{
		GSNormalAcc gsnormal = new GSNormalAcc(accNo,accNm,charges,deliveryCharge);
		return null;
	}
	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, float isPrime) {
		// TODO Auto-generated method stub
		return null;
	}


}
