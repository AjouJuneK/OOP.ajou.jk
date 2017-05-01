package kr.ac.ajou.lab07.task01;

public class Laptop extends Product implements Networked,DataStorage {

	private double totalCapacity;
	private double usedCapacity;
	
	
	@Override
	public double getFreeCapacity(){
		if(totalCapacity < 0 || usedCapacity < 0) {
			System.out.println("Free capacity calculation ERROR!");
			return 0;
		}
		else
			return totalCapacity - usedCapacity;
	}
	
	@Override
	public void format(){
		System.out.println("Storage Format : NTFS");
		
	}
	
	
	@Override
	public boolean isConnected() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public double maxSpeed() {
		// TODO Auto-generated method stub
		return 66.66;
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
		if(totalCapacity >= 0)
			this.totalCapacity = totalCapacity;
		else
			System.out.println("Total Capacity input ERROR!(Under 0)");
	}

	public double getUsedCapacity() {
		return usedCapacity;
	}

	public void setUsedCapacity(double usedCapacity) {
		if(usedCapacity >= 0)
			this.usedCapacity = usedCapacity;
		else
			System.out.println("Used Capacity input ERROR!(Under 0)");
	}



}
