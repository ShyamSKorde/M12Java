package com.tnsif.Framework;

public interface ShopFactory //remove all abstract class becouse abstaract class can not instanshiation 
                             // interface because ShopFactory is Extended by GSShopFactory which in Different Package different packages package to packages access to interfce
{
	public abstract PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, float isPrime );
	public abstract NormalAcc getNewNormalAccount(int accNo, String accNm,float charges,float deliveryCharge );



}
