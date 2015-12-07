package car;

import bear.Bear;

public class Car {
	
	private int wheels;
	private String manu;
	private String type;
	
	public Car(int wheels, String manu, String type){
		this.wheels = wheels;
		this.manu = manu;
		this.type = type;
	}
	
	public static void main (String[] args){
		Car robin = new Car(3, "Reliant", "Top Gear");
		robin.setWheels(2);
		System.out.println("de auto heeft " + robin.getWheels() + " wielen");
	}
	
	public int getWheels() {
		return wheels;
	}
	
	public void setWheels (int newWheels) {
		this.wheels = newWheels;
	}

		

}
