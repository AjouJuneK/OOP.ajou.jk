package kr.ac.ajou.lab07.task01;

public abstract class Product {

	// instance variable
	private double price;

	// constructor
	//delete cons in abs class by namori

	// method
	public abstract String getName();

	// getter and setter
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price > 0)
			this.price = price;
		else
			System.out.println("Price input ERROR!(Input more than 0)");
	}
}
