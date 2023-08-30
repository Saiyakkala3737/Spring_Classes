package in.ashokit.java8;

import java.util.function.BiFunction;

public class FunctionDemo2 {

	public static void main(String[] args) {
	BiFunction<Integer,Integer,Integer> f = (a,b) -> a+b;
	
	System.out.println(f.apply(1, 2));
	System.out.println(f.apply(2, 2));
	
	}
}
