package week1.day1;

public class Car {
	
	public void driveCar() {
		// TODO Auto-generated method stub
		
		System.out.println("Drive Car");

	}
	
	public void applyBreak() {
		// TODO Auto-generated method stub

		System.out.println("Apply Break");
	}
	
	public void soundHorn() {
		// TODO Auto-generated method stub
		System.out.println("Sound Horn");

	}
	
	public void isPuncture() {
		// TODO Auto-generated method stub
		System.out.println("Is Puncture");
	}

	public static void main(String[] args) {
		
		Car c = new Car();
		c.driveCar();
		c.applyBreak();
		c.soundHorn();
		c.isPuncture();
	}
}
