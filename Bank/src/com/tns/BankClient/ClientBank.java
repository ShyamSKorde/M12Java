package com.tns.BankClient;

import com.tnsif.ApplicationparforBank.MMBankFactory;
import com.tnsif.ApplicationparforBank.MMCurrentAcc;
import com.tnsif.ApplicationparforBank.MMSavingAcc;

public class ClientBank 
{

	public static void main(String[] args) 
	{
		MMBankFactory mmbankfactory = new MMBankFactory();
		mmbankfactory.getNewSavingAccount(222, "Arjun", 2000, true);
		mmbankfactory.getNewCurrentAccount(333, "Ajit", 500, 500);
		// TODO Auto-generated method stub
		MMSavingAcc mmsavingacc = new MMSavingAcc(222,"Arjun",2000, true);
		mmsavingacc.getAccNo();
		mmsavingacc.getAccNm();
		mmsavingacc.getAccBal();
		mmsavingacc.withdraw(2000);
		mmsavingacc.toString();
		
		MMCurrentAcc mmcurrentacc = new MMCurrentAcc(222, "Ajit", 1000, 500);
		mmcurrentacc.getAccNo();
		mmcurrentacc.getAccNm();
		mmcurrentacc.getAccBal();
		mmcurrentacc.withdraw(1000);
		mmcurrentacc.toString();
		
	}
	
}