package in.ashokit.java8;

import java.util.function.Predicate;

//to check whthere the number is greater than 10 using predicate functional interface

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<Integer> p = i -> i > 10;
		System.out.println(p.test(5));
	}

}
