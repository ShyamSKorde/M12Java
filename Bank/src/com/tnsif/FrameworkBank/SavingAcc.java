package com.tnsif.FrameworkBank;

public class SavingAcc extends BankAcc  //Prime 
{
	protected boolean isSalary;
	
    

	public SavingAcc(int accNo, String accNm,float accBal, boolean isSalary)
	{
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
		
		// TODO Auto-generated constructor stub
	}

	public void withdraw( float accBal)
	{
		
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
    

}
