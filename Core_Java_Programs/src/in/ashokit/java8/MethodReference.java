package in.ashokit.java8;
interface MyInterface {
	public void m1();
}

public class MethodReference {
    public static void m2() {
		System.out.println("This is M2() method");
	}

	public static void main() {
		MyInterface mi = MethodReference::m2;
		mi.m1();
	}

    
}
