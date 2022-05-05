package com.tnsif.FrameworkBank;

public interface BankFactory 
{
	public abstract SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal,float isSalary );
	public abstract CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal,float creditLimit);

}
