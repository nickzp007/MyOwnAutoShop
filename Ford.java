package com.bridgelabz;

public class Ford extends Car{
	int year;
	int manufactureDiscount;

	//Creating Constructor To Give Values To Variables
	public Ford(int speed, double regularPrice, String colour, int year, int manufactureDiscount ) {
		super(speed, regularPrice, colour);
		this.year = year;
		this.manufactureDiscount = manufactureDiscount;
	}

	@Override
	//To Compute Price According To Manufacture Discount
	public double getSalePrice() {
		regularPrice = regularPrice - manufactureDiscount;
		return regularPrice;
	}

	@Override
	public String toString() {
		return "Ford(year=" +year+ ", manufactureDiscount=" +manufactureDiscount+", getSalePrice=" +getSalePrice()+")";
	}
}


