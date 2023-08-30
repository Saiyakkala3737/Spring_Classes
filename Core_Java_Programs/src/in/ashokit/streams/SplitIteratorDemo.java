package in.ashokit.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;

public class SplitIteratorDemo {
	
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sachin","sewag","dhoni");
		Spliterator<String> spliterator = names.stream().spliterator();
		spliterator.forEachRemaining(n ->System.out.println(n));
	}

}
