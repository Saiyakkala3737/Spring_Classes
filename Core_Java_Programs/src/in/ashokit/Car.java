package in.ashokit;

interface Vehicle {
	public void start();

	public default void clean() {
		System.out.println("cleaning completed");
	}
}

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("car start...");
	}
 
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
		c.clean();
	}
}
