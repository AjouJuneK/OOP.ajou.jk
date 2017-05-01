package kr.ac.ajou.lab07.task01;

public class Toaster extends Product implements Cooker {

	public Toaster(double price) {
		super(price);
	}

	@Override
	public String getName() {

		return "Toaster";
	}

	@Override
	public String prepareFood() {

		return "Toaster is prepareing Food";
	}

}
