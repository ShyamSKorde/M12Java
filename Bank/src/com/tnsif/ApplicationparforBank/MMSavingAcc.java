package com.tnsif.ApplicationparforBank;

import com.tnsif.FrameworkBank.SavingAcc;

public class MMSavingAcc extends SavingAcc//gsprimeacc
{
	
	private static final float accBal=0;
	
    public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary)
    {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}
    public void withdraw( float accBal)
	{
		System.out.println(" Your current Balence is " +accBal);
	}
	@Override
	public String toString() {
		return "MMSavingAcc [isSalary=" + isSalary + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
				+ ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
    
}
