package com.tnsif.FrameworkBank;

public class CurrentAcc extends BankAcc //Normal 
{
	  public final float creditLimit;
	 
	 public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit)
	 {
		 super(accNo, accNm, accBal);
		 this.creditLimit = creditLimit;
		// TODO Auto-generated constructor stub
	}

	public void withdraw(float accBal)
	 {
		 
	 }

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
     
	 
}
