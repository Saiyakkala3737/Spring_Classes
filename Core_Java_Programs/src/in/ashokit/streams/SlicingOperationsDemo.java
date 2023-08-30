package in.ashokit.streams;

import java.util.Arrays;
import java.util.List;

public class SlicingOperationsDemo {

	public static void main(String[] args) {
		List<String> javacourses = Arrays.asList("core java", "adv java", "springboot", "restapi", "microservices");
		javacourses.stream().limit(3).forEach(c -> System.out.println(c));
		javacourses.stream().skip(3).forEach(c -> System.out.println(c));
	}
} 
