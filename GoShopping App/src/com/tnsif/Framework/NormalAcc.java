package com.tnsif.Framework;

public class NormalAcc extends ShopAcc //current 
{

	public final float deliveryCharge;//purchase any product in NormalAcc add its is defaultly is final  
  
	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges);
		this.deliveryCharge = deliveryCharge;
	}

	public void bookProduct(float charges)//@Override method in (primeACC & ShopAcc)
	{
		
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + ", accNo=" + accNo + ", accNm=" + accNm + ", charges="
				+ charges + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]"; //Its inherites the properties acquire the properties of of all thje Parents class variables 
	}
    
}













/* PrimeAcc & NormaAcc Difference 
 * chagres and delivery charges 
 * 400 -> 400  & 400+125(Charges125) -> 525 
 */