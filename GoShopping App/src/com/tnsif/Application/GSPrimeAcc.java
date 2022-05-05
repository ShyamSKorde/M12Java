package com.tnsif.Application;

import com.tnsif.Framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc //mmsavingacc
{
	private static final float charges=0;  //charges=0; is final no charges of prime account people
	
	public GSPrimeAcc(int accNo, String accNm, boolean isPrime) {
		super(accNo, accNm, charges, isPrime);
		// TODO Auto-generated constructor stub
	} 
	
	
	public void bookProduct(float charges)
	{
		System.out.println("Dear Prime users, your product charges are " +charges);
		
	}
    @Override
	public String toString() {
		return "GSPrimeAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



		// TODO Auto-generated method stub
    
}
