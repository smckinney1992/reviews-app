package inheirtance;
interface Bevarages{
	int cost=5;
	void prepareTea();
}

abstract class Vehicle{
	int price;
	abstract void start();
	abstract void stop();
	public void applyingBrake() {
		System.out.println("Applying brake should stop the vehicle");
		
	}
}
class Bike extends Vehicle{

	@Override
	void start() {
		System.out.println("Bike start by self or by kick");
		
	}

	@Override
	void stop() {
		System.out.println("Bie switches off by using keys");
		
	}
	
}
public class DemoAbstract {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.start();
		b.applyingBrake();
		b.stop();

	}

}
