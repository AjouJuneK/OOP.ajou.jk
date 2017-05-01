package kr.ac.ajou.lab07.task01;

public abstract class Product {

	// instance variable
	private double price;

	//method
	public abstract String getName();
	
	// getter and setter
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
