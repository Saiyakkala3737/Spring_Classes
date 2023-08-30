package in.ashokit.java8;

import java.util.function.Supplier;

public class ConstructorRef {

	public static void main(String[] args) {
		Supplier<Doctor> s=Doctor::new;
		System.out.println(s.get().hashCode());
	}
}


class Doctor {
	
	public Doctor() {
		System.out.println("Doctor Constructor...");
	}
}