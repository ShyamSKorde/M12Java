package com.tnsif.Framework;

public class PrimeAcc extends ShopAcc  //saving 
{
	protected boolean isPrime;
	
	
	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime)
	{
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}

	public void bookProduct(float chagres)
	{
		
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
	//toString is a method which is used to get the data or travers the data from class to class access the data present class (hash code avoide the problem get the not a hash code)
}
