package motorvehicle;
class Vehicle{
	public int noOfWheels() {
		int noOfWheels = 0;
		return noOfWheels;
	}
	public void roadType() {
		System.out.println("All roads");
	}
}

class Car extends Vehicle{
	public void color() {
		System.out.println("-------------Car------------------");
		String color = "Blue";
		System.out.println("Car color: "+color);
		super.noOfWheels();
		int carwheels = 4;
		System.out.println("No. of vehicle wheels: "+carwheels);
	}
	
}
class Bus extends Vehicle{
	public void color() {
		System.out.println("-------------Bus------------------");
		String color = "Yellow";
		System.out.println("Bus color:"+color);
		super.noOfWheels();
		int buswheels = 8;
		System.out.println("No. of vehicle wheels: "+buswheels);
		
	}
	
}
class Semitruck extends Vehicle{
	public void color() {
		System.out.println("------------------Semitruck------------------");
		String color = "White";
		System.out.println("Semitruck color: "+color);
		super.noOfWheels();
		int truckwheels = 16;
		System.out.println("No. of vehicle wheels: "+truckwheels);
	}
	
}
public class VehicleDemo {

	public static void main(String[] args) {
		Car c = new Car();
		c.noOfWheels();
		c.color();
		c.roadType();
		
		Bus b = new Bus();
		b.noOfWheels();
		b.color();
		b.roadType();
		
		Semitruck t = new Semitruck();
		t.noOfWheels();
		t.color();
		t.roadType();
		
	}
}
