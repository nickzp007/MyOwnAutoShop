package com.bridgelabz;

public class Truck extends Car {
	int weight;

	public Truck(int speed, double regularPrice, String colour, int weight) {
		super(speed, regularPrice, colour);
		this.weight = weight;
	}

	@Override
	public double getSalePrice() {
		if(weight > 2000) {
			regularPrice = regularPrice - (regularPrice / 10);
		}
		else{
			regularPrice = regularPrice - (regularPrice / 5);
		}
		return regularPrice;
	}

	@Override
	public String toString() {
		return "Truck(weight=" +weight+ ", getSalePrice=" +getSalePrice()+")";
	}
}


