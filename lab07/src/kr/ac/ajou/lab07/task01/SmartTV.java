package kr.ac.ajou.lab07.task01;

public class SmartTV extends Product implements Networked {

	public SmartTV(double price) {
		super(price);
		// TODO Auto-generated constructor stub
	}

	private int channel;
	
	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel >= 0)
			this.channel = channel;
		else
			System.out.println("Channel input ERROR!");
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "I am Smart TV";
	}
	
	public boolean isConnected()
	{
		System.out.println("TV is connected");
		return true;
	}
	
	public double maxSpeed()
	{
		System.out.println("TV return integer 30");
		return 30;
	}
	

	
	

}
