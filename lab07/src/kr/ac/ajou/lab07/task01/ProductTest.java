package kr.ac.ajou.lab07.task01;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductTest pt = new ProductTest();
		
		SmartTV tv = new SmartTV();
		tv.setPrice(29999.123);
		tv.setChannel(13);
		
		Laptop lt = new Laptop();
		lt.setPrice(1999.999);
		lt.setTotalCapacity(99.99);
		lt.setUsedCapacity(43.21);
		
		pt.testProduct(tv);
		pt.testNetworked(tv);
		pt.testProduct(lt);
		pt.testDataStorage(lt);
		pt.testNetworked(lt);
	}
	
	public void testProduct(Product p)
	{
		System.out.println("It is "+p.getName()+".");
		System.out.println("Price is $"+p.getPrice());
		
	}
	
	public void testDataStorage(DataStorage ds)
	{
		System.out.println("Storage free capacity is "+
	String.format("%.2f",ds.getFreeCapacity())+" Giga bytes!");
	}
	
	public void testNetworked(Networked n)
	{
		System.out.println("It is connected? "+ n.isConnected());
		System.out.println("Max speed is "+ n.maxSpeed()+" MB/s");
		System.out.println();
	}

	public void testCooker(Cooker c)
	{
		
	}
}
