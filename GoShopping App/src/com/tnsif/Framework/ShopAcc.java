package com.tnsif.Framework;

public class ShopAcc
{
	protected int accNo;
	protected String accNm;
    protected  float charges;
	
	
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	public ShopAcc(int accNo, String accNm, float charges) //constuctor :- avoide the direct contact with the variable provide internal contact with constructor give security 
	{
		super();                //parent class 
		this.accNo = accNo;    //particular class current class 
		this.accNm = accNm;
		this.charges = charges;
	}
	public void bookProduct(float charges)
	{
		
	}
	public void items(float charges)
	{
		
	}
	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	//toString is a method which is used to get the data or travers the data from class to class access the data present class (hash code avoide the problem get the not a hash code)

}
