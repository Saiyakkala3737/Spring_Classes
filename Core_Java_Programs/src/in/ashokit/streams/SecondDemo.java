package in.ashokit.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SecondDemo {

	public static void main(String[] args) {
		// approach-1
		Stream<Integer> stream1 = Stream.of(66, 32, 45, 12, 20);

		// Regular approach
		List<Integer> list = Arrays.asList(66, 32, 45, 12, 20);
		/*
		 * for (Integer i : list) { if (i > 20) { System.out.println(i); } }
		 */
		Stream<Integer> stream = list.stream();
		Stream<Integer> filter = stream.filter(i ->i>20);
		filter.forEach(i-> System.out.println(i));
	}

}
