package in.ashokit.streams;

import java.util.stream.Stream;

public class ParllelStreamDemo {

	public static void main(String[] args) {

		System.out.println("========= Serial Stream =========");
		Stream<Integer> ss = Stream.of(1, 2, 3, 4);
		ss.forEach(n -> System.out.println(n + " :: " + Thread.currentThread()));
		

		System.out.println("========= Parllel Stream =========");
		Stream<Integer> ps = Stream.of(1, 2, 3, 4);
		ps.parallel().forEach(n -> System.out.println(n + " :: " + Thread.currentThread()));
	}
}
