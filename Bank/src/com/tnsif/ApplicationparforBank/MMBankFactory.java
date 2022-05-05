package com.tnsif.ApplicationparforBank;

import com.tnsif.FrameworkBank.BankFactory;
import com.tnsif.FrameworkBank.CurrentAcc;
import com.tnsif.FrameworkBank.SavingAcc;

public class MMBankFactory implements BankFactory
{
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, boolean b)
	{
		SavingAcc savingacc = new SavingAcc(accNo, accNm,accBal, b);
		return savingacc;
		
	}
	public CurrentAcc getNewCurrentAccount(int accNo, String accNm, float accBal, float creditLimit)
	{
		CurrentAcc currentacc = new CurrentAcc(accNo, accNm, accBal, creditLimit);
		return null;
		
	}
	@Override
	public SavingAcc getNewSavingAccount(int accNo, String accNm, float accBal, float isSalary) {
		// TODO Auto-generated method stub
		return null;
	}
	

	

}
