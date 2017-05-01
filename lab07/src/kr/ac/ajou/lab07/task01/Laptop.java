package kr.ac.ajou.lab07.task01;

public class Laptop extends Product implements Networked,DataStorage {

	private double totalCapacity;
	private double usedCapacity;
	
	
	public Laptop(double price) {
		super(price);
		// TODO Auto-generated constructor stub
	}
	
	public double getFreeCapacity(){
		
		return 0;
	}
	
	public void format(){
		
		
	}
	
	
	@Override
	public boolean isConnected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double maxSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Laptop";
	}
	
	
	
	public double getTotalCapacity() {
		return totalCapacity;
	}

	public void setTotalCapacity(double totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public double getUsedCapacity() {
		return usedCapacity;
	}

	public void setUsedCapacity(double usedCapacity) {
		this.usedCapacity = usedCapacity;
	}



}
