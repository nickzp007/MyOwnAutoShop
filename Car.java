package com.bridgelabz;

public class Car {
	int speed;
	double regularPrice;
	String colour;

	public Car(int speed, double regularPrice, String colour ) {
		this.speed = speed;
		this.regularPrice = regularPrice;
		this.colour = colour;
	}

	public double getSalePrice(){
		return regularPrice;
	}
	public String toString(){
		return "Car (speed=" +speed+", regularPrice=" +regularPrice+ ", color=" +colour+ ", getSalePrice()=" +getSalePrice()+"  ) ";
	}
}
